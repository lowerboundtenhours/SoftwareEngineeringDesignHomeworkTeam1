import java.util.Map;

public class TextComposition implements CompositionInterface {
    private int arrayWidth = 3;
    public String[] compose (Map<String, Component> componentMap) {
        String[] lines = new String[componentMap.size()];
        int i = 0;
        for (Map.Entry<String, Component> entry : componentMap.entrySet()) {
            Component component = entry.getValue();
            String content = component.getContent();
            String spliter = content.equals("<ParagraphEnd>") ? "\n" : " ";
            lines[i] = String.format("[%s]%s%s", component.getNaturalSize(), content, spliter);
            i++;
        }
        return lines;
    }
}
