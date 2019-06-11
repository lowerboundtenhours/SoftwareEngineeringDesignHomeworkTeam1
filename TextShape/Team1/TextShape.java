public class TextShape extends TextShapeInterface {
    private String text = new String();
    private int width;
    private int height;

    public TextShape(String text, int width, int height) {
        this.text = text;
        this.width = width;
        this.height = height;
    }

    public void display() {
        System.out.printf(text + '\n');
    }

    public void boundingBox() {
        System.out.printf("Bounding box: width = %d, height = %d\n", width, height);
    }
}
