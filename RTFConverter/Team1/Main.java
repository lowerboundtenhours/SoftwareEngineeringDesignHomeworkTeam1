import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    

    public static List<String> read_file(String filename) {
        List<String> allLines = new ArrayList<String>();
        try {
            allLines = Files.readAllLines(Paths.get(filename));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }

    public static void main(String[] args) {

        TextFormatFactory factory = new TexFactory();
        // List<Token> tokens = new ArrayList<Token>();

        String filename = args[0];
        for (String line : read_file(filename)) {
            if (line.equals("TeX")) {
                factory = new TexFactory();
            }
            else if (line.equals("TextWidget")) {
                factory = new TextWidgetFactory();
            }
            else {
                final int len = line.length();
                for (int i = 0; i < len; i++) {
                    if (line.charAt(i) == 'C') {
                        Token a = factory.createCToken();
                        a.print();
                    }
                    else if (line.charAt(i) == 'F') {
                        Token a = factory.createFToken();
                        a.print();
                    }
                    else if (line.charAt(i) == 'P') {
                        Token a = factory.createPToken();
                        a.print();
                    }
                }
                System.out.println("");
            }
        }
    }
}