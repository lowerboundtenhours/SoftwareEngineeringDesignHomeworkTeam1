public class TextViewAdapter extends TextShapeInterface {
    private TextView textView = null;
    
    public TextViewAdapter(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void display() {
        textView.display();
    }

    @Override
    public void boundingBox() {
        textView.getExtent();
    }
}
