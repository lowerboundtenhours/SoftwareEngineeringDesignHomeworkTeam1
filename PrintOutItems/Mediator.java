import java.util.HashMap;

public class Mediator {
    HashMap<String, DataStructure> dataStructures;
    public void create(String name, String type) {
        if (type.equals("SkipList")) {
            dataStructures.put(name, new SkipList());
        } else {
            dataStructures.put(name, new List());
        }
    }
    public void add(String name, String element) {
        dataStructures.get(name).add(element); 
    }
    public void command(String[] commands) {
        String name = commands[0];
        String method = commands[1];
        DataStructure ds = dataStructures.get(name);
        if (ds instanceof SkipList) {
            if (method == "Size") {
                System.out.println(ds.getLengthOrSize());
            } else if (method == "GetNode") {
                int index = Integer.parseInt(commands[2]);
                ds.getByIndex(index);
            } else {
                System.out.println(String.format("SkipList do not have method %s", lowerFirstChar(method)));
            }
        } else {
            if (method == "Length") {
                System.out.println(ds.getLengthOrSize());
            } else if (method == "Get") {
                int index = Integer.parseInt(commands[2]);
                ds.getByIndex(index);
            } else {
                System.out.println(String.format("SkipList do not have method %s", lowerFirstChar(method)));
            }
        }
    }
    private String lowerFirstChar(String str) {
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }
}
