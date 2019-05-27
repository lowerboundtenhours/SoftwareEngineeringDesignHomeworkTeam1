public class PancakeHouseMenuIterator implements MenuIterator{
    private PancakeHouseMenu menu;
    private int pos;
    public PancakeHouseMenuIterator(PancakeHouseMenu menu) {
        this.menu = menu;
        this.pos = 0;
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

