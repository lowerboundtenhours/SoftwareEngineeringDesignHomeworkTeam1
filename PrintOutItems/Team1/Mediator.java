import java.util.HashMap;

public class Mediator {
    HashMap<String, DataStructure> dataStructures = new HashMap<>();
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
    public void traversePrint(String name) {
        dataStructures.get(name).traverse();
    }
    public void command(String[] commands) {
        String method = commands[0];
        String name = commands[1];
        DataStructure ds = dataStructures.get(name);
        if (ds instanceof SkipList) {
            // System.out.println(method + "!!!");
            if (method.equals("Size")) {
                System.out.println(ds.getLengthOrSize());
            } else if (method.equals("GetNode")) {
                int index = Integer.parseInt(commands[2]);
                ds.getByIndex(index);
            } else if (method.equals("Length")) {
                System.out.println(String.format("SkipList can not access %s", lowerFirstChar(method)));
            } else {
                System.out.println(String.format("SkipList do not have method %s", lowerFirstChar(method)));
            }
        } else if (ds instanceof List) {
            if (method.equals("Length")) {
                System.out.println(ds.getLengthOrSize());
            } else if (method.equals("Get")) {
                int index = Integer.parseInt(commands[2]);
                ds.getByIndex(index);
            } else {
                System.out.println(String.format("List do not have method %s", lowerFirstChar(method)));
            }
        }
    }
    private String lowerFirstChar(String str) {
        return Character.toLowerCase(str.charAt(0)) + str.substring(1);
    }
}
