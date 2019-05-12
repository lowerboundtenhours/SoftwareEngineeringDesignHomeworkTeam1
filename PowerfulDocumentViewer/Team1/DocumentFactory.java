public class DocumentFactory {
    public Document create(String type) {
        if (type.equals("Draw")) {
            return new DrawingDocument();
        } else {
            return new TextDocument();
        }
    }
}