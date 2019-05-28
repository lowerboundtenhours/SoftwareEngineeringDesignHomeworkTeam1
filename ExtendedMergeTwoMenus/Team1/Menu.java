public interface Menu extends MenuComponent {
    public void print();
    public Iterator createIterator();
    public void add(MenuComponent component);
    public MenuComponent get(int index);
}
