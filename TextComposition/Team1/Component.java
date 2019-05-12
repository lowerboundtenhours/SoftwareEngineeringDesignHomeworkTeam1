public class Component {
    protected String ID;
    protected int naturalSize;
    protected int shrinkability;
    protected int stretchability;
    protected String content;

    public void setNaturalSize(int newSize) {
        if (newSize < this.shrinkability || this.stretchability < newSize) {
            System.out.printf("component %s failed to change size\n", this.ID);
        } else {
            System.out.printf("component %s size changed to %d\n", this.ID, newSize);
            this.naturalSize = newSize;

        }
    }

    public String getID() {
        return this.ID;
    }

    public int getNaturalSize() {
        return this.naturalSize;
    }

    public int getShrinkability() {
        return this.shrinkability;
    }

    public int getStretchability() {
        return this.stretchability;
    }

    public String getContent() {
        return this.content;
    }
}

