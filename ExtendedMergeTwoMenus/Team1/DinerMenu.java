public class DinerMenu implements Menu {
    private MenuComponent[] menuItems = new MenuComponent[1000];
    private int size = 0;

    public Iterator createIterator() {
        return new DinerMenuIterator(this);
    }

    public int getSize() {
        return this.size;
    }

    public void add(MenuComponent item) {
        this.menuItems[this.size] = item;
        this.size += 1;
    }

    public MenuComponent get(int index) {
        if (index >= this.size)
            return null;
        else
            return this.menuItems[index];
    }

    public void print() {
       DinerMenuIterator iterator = (DinerMenuIterator)this.createIterator();

       while (!iterator.isDone()) {
           int index = iterator.next();
           MenuComponent component = iterator.getItem(index);
           if (component instanceof Menu)
               System.out.println("SubMenu:");
           component.print();
       }
    }
}
