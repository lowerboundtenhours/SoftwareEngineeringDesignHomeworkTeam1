public class PancakeMenu implements Menu {
    private MenuItem[] menuItems = new MenuItem[1000];
    private int size = 0;

    public Iterator createIterator() {
        return new PancakeMenuIterator(this);
    }

    public int getSize() {
        return this.size;
    }

    public void add(MenuComponent item) {
        this.menuItems[this.size] = (MenuItem) item;
        this.size += 1;
    }

    public MenuItem get(int index) {
        return this.menuItems[index];
    }

    public void print() {
        PancakeMenuIterator iterator = (PancakeMenuIterator)this.createIterator();

        while (!iterator.isDone()) {
            int index = iterator.next();
            MenuItem item = (MenuItem) iterator.getItem(index);
            item.print();
        }
    }
}
