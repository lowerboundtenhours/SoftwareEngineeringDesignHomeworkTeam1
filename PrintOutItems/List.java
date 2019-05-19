import java.util.ArrayList;

public class List implements DataStructure{
    private ArrayList<String> storage;
    public void getByIndex(int index) {
        System.out.println(String.format("%s", storage.get(index)));
    }
    public int getLengthOrSize() {
        return storage.size();
    }
    public void traverse() {
       for (int i = 0; i < this.getLengthOrSize(); i++)
           this.getByIndex(i);
    }
    public void add(String element) {
        this.storage.add(element);
    }
}

