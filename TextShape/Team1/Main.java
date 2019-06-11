import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    
    
    public static void main(String[] args) {
        HashMap<String, TextShapeInterface> list = new HashMap<String, TextShapeInterface>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                if (tokens[0].equals("TextShape")) {
                    TextShape textShape = new TextShape(tokens[2], Integer.valueOf(tokens[3]), Integer.valueOf(tokens[4]));
                    list.put(tokens[1], textShape);
                } else if (tokens[0].equals("display")) {
                    list.get(tokens[1]).display();
                } else if (tokens[0].equals("boundingBox")) {
                    list.get(tokens[1]).boundingBox();
                }
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
