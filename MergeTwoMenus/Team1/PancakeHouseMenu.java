import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{
    private ArrayList<MenuItem> items = new ArrayList<>();
    public PancakeHouseMenu(ArrayList<String> inputs) {
        for (String input: inputs) {
            items.add(new MenuItem(input));
        }
    }
    public MenuIterator createIterator() {
        return new PancakeHouseMenuIterator(this);
    }
    public MenuItem get(int i) {
        return items.get(i);
    }
    public int size() {
        return items.size();
    }
}

