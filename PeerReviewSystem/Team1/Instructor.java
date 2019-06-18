import static java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;

public class Instructor {

    private PeerReviewSystem system;
    public Instructor(PeerReviewSystem system) {
        this.system = system;
    }

    public Assignment createAssignment(String id) {
        return new Assignment(id);
    }

    public void setAssignReviewNumber(Assignment assignment, int n) {

    }

    public void setAssignemntRubric(Assignment assignment, Rubric rubric) {
        assignment.setRubric(rubric);
    }

    public void getAssignmentAverageCriterion(String aId) {
        ArrayList<SimpleEntry<String, Float>> ret = system.getAssignmentAverageCriterion(aId);
        for (SimpleEntry<String, Float> entry: ret) {
            String out = String.format("Assignment: %s, Criterion: %s, AvgScore: %.1f", aId, entry.getKey(), entry.getValue());
            System.out.println(out);
        }
    }

    public void getStudentScore(String aId, String sId, String strategy) {
        float score = system.getStudentScore(aId, sId, strategy);
        System.out.printf("Assignment: %s, Student: %s, Score: %.1f%n", aId, sId, score);
    }

    public void getStudentStrength(String aId, String sId, String strategy) {
        System.out.printf("Assignment: %s, Student: %s, Strength:", aId, sId);
        ArrayList<String> strs = system.getStudentStrength(aId, sId, strategy);
        for (String str: strs) {
            System.out.printf(" %s", str);
        }
        System.out.println("");
    }

    public void getStudentWeakness(String aId, String sId, String strategy) {
        System.out.printf("Assignment: %s, Student: %s, Weakness:", aId, sId);
        
        ArrayList<String> strs = system.getStudentWeakness(aId, sId, strategy);
        for (String str : strs) {
            System.out.printf(" %s", str);
        }
        System.out.println("");
    }
}
