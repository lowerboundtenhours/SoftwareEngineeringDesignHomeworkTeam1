import java.util.ArrayList;

public class QuestionComponent extends Component {
    public QuestionComponent() {
        this.components = new ArrayList<>();
    }
    public void addComponent(Component c) {
        this.components.add(c);
    }
    public void draw() {
        for (Component c: this.components) {
            c.draw();
            System.out.printf("\n");
        }
    }
}