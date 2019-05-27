import java.util.ArrayList;

public class DinerMenu implements Menu{
    private MenuItem[] items;
    public DinerMenu(ArrayList<String> inputs) {
        ArrayList<MenuItem> tmp = new ArrayList<>();
        for (String input: inputs) {
            tmp.add(new MenuItem(input));
        }
        items = tmp.toArray(new MenuItem[tmp.size()]);
    }
    public MenuIterator createIterator() {
        return new DinerMenuIterator(this);
    }
    public MenuItem get(int i) {
        return items[i];
    }
    public int size() {
        return items.length;
    }
}

