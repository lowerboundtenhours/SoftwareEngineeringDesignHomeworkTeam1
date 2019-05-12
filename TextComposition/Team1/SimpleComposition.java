import java.util.Map;

public class SimpleComposition implements CompositionInterface {
    public String[] compose (Map<String, Component> componentMap) {
        String[] lines = new String[componentMap.size()];
        int i = 0;
        for (Map.Entry<String, Component> entry : componentMap.entrySet()) {
            Component component = entry.getValue();
            lines[i] = String.format("[%s]%s\n", component.getNaturalSize(), component.getContent());
            i++;
        }
        return lines;
    }
}
