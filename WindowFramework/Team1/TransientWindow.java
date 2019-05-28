public class TransientWindow extends Window {
    public TransientWindow(Implement implement) {
        this.implement = implement;
    }

    public void drawBorder() {
        // not supported
    }

    public void drawCloseBox() {
        this.implement.drawRect();
    }
}
