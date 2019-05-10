import java.util.ArrayList;

public class Application {
    private DocumentFactory factory;
    private ArrayList<Document> documents = new ArrayList<>();
    public Application() {
        this.factory = new DocumentFactory();
    }

    public void present() {
        for (Document document: documents) {
            System.out.println(document.present());
        }
    }

    public void createDoc(String arg) {
        this.documents.add(this.factory.create(arg));
    }
}