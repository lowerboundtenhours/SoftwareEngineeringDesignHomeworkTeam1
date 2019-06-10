public class TextView {
    private String text = new String();
    private int width;
    private int height;

    public TextView(String text, int width, int height) {
        this.text = text;
        this.width = width;
        this.height = height;
    }

    public void display() {
        System.out.printf(text + '\n');
    }

    public void getExtent() {
        System.out.printf("Bounding box: width = %d, height = %d\n", width, height);
    }
}
