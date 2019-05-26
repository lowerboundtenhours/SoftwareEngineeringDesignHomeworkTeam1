public class PancakeMenuIterator implements Iterator {
    private PancakeMenu menu;
    private int size = 0;
    private int currentInt = 0;

    public PancakeMenuIterator(PancakeMenu menu) {
        this.menu = menu;
        this.size = menu.getSize();
    }

    public int first() {
        if (this.size > 0)
            return 0;
        else
            return -1;
    }
    
    public int next() {
        int nextIndex = this.currentInt;
        this.currentInt += 1;
        return nextIndex;
    }

    public boolean isDone() {
        if (this.currentInt >= this.size)
            return true;
        else
            return false;
    }

    public MenuComponent getItem(int index) {
        return menu.get(index);
    }
}
