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
        } catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }
    public static void main(String[] args) {

        EmailHandler handler = new SpamHandler(
            new CompliantHandler(
                new FanHandler(null)
            )
        );

        String filename = args[0];
        Email email;
        List<String> input = read_file(filename);
        for (int i = 0; i < input.size(); i++) {
            String line = input.get(i);
            if (line.equals("SPAM")) {
                email = new Spam();
                handler.handle(email);
            } else if (line.equals("COMPLAINT")) {
                email = new CompliantMail();
                handler.handle(email);
            } else if (line.equals("FAN")) {
                email = new FanEmail();
                handler.handle(email);
            }
            if (i < input.size() - 1)
                System.out.println("");
        }
    }
}