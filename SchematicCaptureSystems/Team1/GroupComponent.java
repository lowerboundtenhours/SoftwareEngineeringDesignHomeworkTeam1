import java.util.ArrayList;

public class GroupComponent extends Component {
    public GroupComponent() {
        this.components = new ArrayList<>();
    }

    public void addComponent(Component c) {
        this.components.add(c);
    }

    public void draw() {
        System.out.print("Group:{");
        for (Component c : this.components) {
            c.draw();
        }
        System.out.print("} ");
    }
}