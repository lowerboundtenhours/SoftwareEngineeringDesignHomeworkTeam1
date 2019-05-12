import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(args[0])));
            String line;
            Application app = new Application();
            while ((line = reader.readLine()) != null) {
                if (line.equals("Present")) {
                    app.present();
                } else {
                    app.createDoc(line);
                }
            }
            reader.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}