import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
            String line;
            Component root = new QuestionComponent();
            Component now = root;
            Stack<Component> componentStack = new Stack<>();
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("<Line/>")) {
                    now.addComponent(new LineComponent());
                } else if (line.trim().equals("<Text/>")) {
                    now.addComponent(new TextComponent());
                } else if (line.trim().equals("<Rectangle/>")) {
                    now.addComponent(new RectangleComponent());
                } else if (line.trim().equals("<Group/>")) {
                    now.addComponent(new GroupComponent());
                } else if (line.trim().equals("<Group>")) {
                    now.addComponent(new GroupComponent());
                    componentStack.push(now);
                    now = now.components.get(now.components.size() - 1);
                } else if (line.trim().equals("</Group>")) {
                    now = componentStack.pop();
                } else {
                    continue;
                }
            }
            root.draw();
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}