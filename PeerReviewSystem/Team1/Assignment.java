import java.util.Map;
import java.util.HashMap;

class Assignment{
    private String id;
    private Map<String, Homework> homeworks;
    private Rubric rubric;
    private int reviewNum;

    Assignment(String _id){
        this.id = _id;
        this.homeworks = new HashMap<String, Homework>();
    }

    public void addHomework(String id, Homework h) {
        homeworks.put(id, h);
    }

    public void setRubric(Rubric rubric) {
        this.rubric = rubric;
    }

    public Rubric getRubric() {
        return this.rubric;
    }

    public String getId(){
        return id;
    }
    public Homework getHomework(String id){
        return homeworks.get(id);
    }
    public int getCriteriaLength() {
        if (this.rubric == null) {
            return 0;
        }
        return this.rubric.getCriteriaLength();
    }

    public String getCriterionName(int i) {
        return this.rubric.getCriteria().get(i).getName();
    }

    public Map<String,Homework> getHomeworks() {
        return homeworks;
    }
}
