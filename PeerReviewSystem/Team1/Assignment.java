import java.util.Map;
import java.util.HashMap;

class Assignment{
    Assignment(String _id){
        this.id = _id;
        this.homeworks = new HashMap<Integer, Homework>();
    }

    public addHomework(String id, Homework h){
        homeworks.put(id, h);
    }
    public String getId(){
        return id;
    }
    public getHomework(String id){
        return homeworks.get(id);
    }

    private String id;
    private Map<String, Homework> homeworks;
}
