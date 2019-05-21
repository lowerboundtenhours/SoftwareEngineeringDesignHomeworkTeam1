import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    public ArrayList<Component> components;
    public abstract void addComponent(Component c);
    public abstract void draw();
}