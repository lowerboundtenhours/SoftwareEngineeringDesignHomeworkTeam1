import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
            String line;
            Window window = null;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
                if (tokens[0].equals("window")) {
                    if (tokens[1].equals("IconWindow")) {
                        window = new IconWindow(getImplement(tokens[2]));
                    } else {
                        window = new TransientWindow(getImplement(tokens[2]));
                    }
                } else if (tokens[0].equals("drawBorder")) {
                    if (window != null) {
                        window.drawBorder();
                    }
                } else if (tokens[0].equals("drawCloseBox")) {
                    if (window != null) {
                        window.drawCloseBox();
                    }
                }
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static Implement getImplement(String type) {
        if (type.equals("XWindow")) {
            return new XWindow();
        } else {
            return new PMWindow();
        }
    }
}