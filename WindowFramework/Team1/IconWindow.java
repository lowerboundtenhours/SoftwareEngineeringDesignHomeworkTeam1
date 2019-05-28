public class IconWindow extends Window {
    public IconWindow(Implement implement) {
        this.implement = implement;
    }

    public void drawBorder() {
        this.implement.drawText();
        this.implement.drawRect();
    }

    public void drawCloseBox() {
        // not supported
    }
}