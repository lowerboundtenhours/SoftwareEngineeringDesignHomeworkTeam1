import java.util.Map;
import java.util.HashMap;

class Assignment{
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

    public void printRubric() {
        
    }

    public String getId(){
        return id;
    }
    public Homework getHomework(String id){
        return homeworks.get(id);
    }

    private String id;
    private Map<String, Homework> homeworks;
    private Rubric rubric;

    public int getCriteriaLength() {
        if (this.rubric == null) {
            return 0;
        }
        return this.rubric.getCriteriaLength();
    }

    public Rubric getRubric() {
        return this.rubric;
    }
}
