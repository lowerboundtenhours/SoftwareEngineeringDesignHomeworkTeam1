import java.util.Map;
import java.util.HashMap;

public class Composer {
    private CompositionInterface composition;
    private Map<String, Component> componentMap = new HashMap<String, Component>();

    public void setComposition(String compositionMethod) {
        switch (compositionMethod) {
            case "SimpleComposition":
                this.composition = new SimpleComposition();
                break;
            case "TexComposition":
                this.composition = new TextComposition();
                break;
            case "ArrayComposition":
                this.composition = new ArrayComposition();
                break;
        }
    }

    public void compose () {
        String[] lines = this.composition.compose(this.componentMap);
		for (String line : lines) {
            System.out.printf(line);
        }
    }
    public void addComponent (String ID, Component component) {
        this.componentMap.put(ID, component);
    }

    public void changeSize (String ID, int newSize) {
        Component component = this.componentMap.get(ID);
        component.setNaturalSize(newSize);
    }
}
