import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Main {
  private static MasterGameMain masterGameMain = new MasterGameMain();

  /** Read input file and generate corresponding output. **/
  public static void read_file(String filename) {
    try {
      List<String> allLines = Files.readAllLines(Paths.get(filename));
      for (String line : allLines) {
        String[] words = line.split(" ");
        String command = words[0];

        switch (command) {
          case "play":
            masterGameMain.play();
            break;
          case "save":
            masterGameMain.save();
            break;
          case "load":
            String state = words[1];
            masterGameMain.load(Integer.parseInt(state));
            break;
          default:
            break;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) { 
    String filename = args[0];
    read_file(filename);
  }

}
