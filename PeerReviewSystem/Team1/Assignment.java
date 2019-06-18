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

    public void printStatus(){
        System.out.print("###############\n");
        System.out.printf("Assignment Id %s\n", id);
        for(Map.Entry<String, Homework> entry: homeworks.entrySet()){
            System.out.printf("Student Id: %s\n", entry.getKey());
            entry.getValue().printStatus();

        } 
        System.out.print("###############\n");
    }

    private String id;
    private Map<String, Homework> homeworks;
    private Rubric rubric;
}
