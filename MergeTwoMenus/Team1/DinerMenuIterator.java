public class DinerMenuIterator implements MenuIterator {
    private DinerMenu menu;
    private int pos;
    public DinerMenuIterator(DinerMenu menu) {
        this.menu = menu;
        int pos = 0;
    }
    public MenuItem first() {
        return null;  // This function is not used at all...
    }
    public void next() {
        pos += 1;
    }
    public boolean isDone() {
        return (pos >= menu.size());
    }
    public MenuItem currentItem() {
        return menu.get(pos);
    }
}

