import static java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;


public class PeerReviewSystem {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Assignment> assignments = new HashMap<>();
    private Map<String, RankingStrategy> rankingStrategies = new HashMap<>();
    private SchoolStrategy schoolStrategy;

    public void addStrategy(String name, RankingStrategy rs) {
        rankingStrategies.put(name, rs);
    }

    public void addAssignment(Assignment assignment) {
        assignments.put(assignment.getId(), assignment);
    }

    public Student getStudent(String id){
        return students.get(id);
    }

    public Assignment getAssignment(String id){
        return assignments.get(id);
    }
    public Boolean assignmentIsExist(String id){
        return this.assignments.containsKey(id);
    }

    public void printRubric(String aid) {
        Rubric rubric = assignments.get(aid).getRubric();
        rubric.printThis();
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void setSchoolStrategy(SchoolStrategy ss) {
        this.schoolStrategy = ss;
    }

    public SchoolStrategy getSchoolStrategy() {
        return this.schoolStrategy;
    }

    private ArrayList<Float> calcScore(String aId, String sId, RankingStrategy rs) {
        Assignment assignment = this.assignments.get(aId);
        Homework homework = assignment.getHomework(sId);
        ArrayList<Review> reviews = homework.getReviews();

        // Calc Scores
        ArrayList<Float> scores = new ArrayList<>();
        for (int i = 0; i < assignment.getCriteriaLength(); i++) {
            ArrayList<Float> reviewScores = new ArrayList<>();
            for (Review review : reviews) {
                float score = review.getLevels().get(i).getScore();
                reviewScores.add(score);
            }
            scores.add(rs.calc(reviewScores));
        }
        return scores;
    }

    public float getStudentScore(String aId, String sId, String strategy) {
        RankingStrategy rs = this.rankingStrategies.get(strategy);
        ArrayList<Float> scores = this.calcScore(aId, sId, rs);
        
        float totalScore = 0;
        for (float score : scores) {
            totalScore += score;
        }
        totalScore = totalScore / scores.size();
        return totalScore;
    }

    public ArrayList<String> getStudentStrength(String aId, String sId, String strategy) {
        RankingStrategy rs = this.rankingStrategies.get(strategy);
        Assignment assignment = this.assignments.get(aId);

        // Calc Scores
        ArrayList<Float> scores = calcScore(aId, sId, rs);

        // Find Strengh
        ArrayList<String> result = new ArrayList<>();
        float maxScore = this.max(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (maxScore - scores.get(i) <= 1e-6f) {
                String name = assignment.getRubric().getCriteria().get(i).getName();
                result.add(name);
            }
        }
        return result;
    }

    public ArrayList<String> getStudentWeakness(String aId, String sId, String strategy) {
        RankingStrategy rs = this.rankingStrategies.get(strategy);
        Assignment assignment = this.assignments.get(aId);

        // Calc Scores
        ArrayList<Float> scores = calcScore(aId, sId, rs);

        // Find Strengh
        ArrayList<String> result = new ArrayList<>();
        float minScore = this.min(scores);
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) - minScore <= 1e-6f) {
                String name = assignment.getRubric().getCriteria().get(i).getName();
                result.add(name);
            }
        }
        return result;
    }

    private float min(ArrayList<Float> list) {
        float minVal = 1e8f;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minVal) {
                minVal = list.get(i);
            }
        }
        return minVal;
    }

    private float max(ArrayList<Float> list) {
        float maxVal = -1e8f;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxVal) {
                maxVal = list.get(i);
            }
        }
        return maxVal;
    }

    public ArrayList<SimpleEntry<String, Float>> getAssignmentAverageCriterion(String aid) {
        ArrayList<SimpleEntry<String, Float>> ret = new ArrayList<SimpleEntry<String, Float>>();
        RankingStrategy meanStrategy = new MeanRankingStrategy();
       
        Assignment assignment = this.getAssignment(aid);
        for (int i = 0; i < assignment.getCriteriaLength(); i += 1) {
            String criterionName = assignment.getCriterionName(i);
            ArrayList<Float> scores = new ArrayList<>();
            for (Homework hw: assignment.getHomeworks().values()) {
                for (Review review: hw.getReviews()) {
                    Float score = review.getLevels().get(i).getScore();
                    scores.add(score);
                }
            }
            Float meanScore = meanStrategy.calc(scores);
            ret.add(new SimpleEntry<String, Float>(criterionName, meanScore));
        }
        return ret;
    }
}
