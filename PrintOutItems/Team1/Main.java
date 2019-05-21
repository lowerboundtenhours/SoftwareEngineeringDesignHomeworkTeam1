import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    Mediator mediator = new Mediator();

    try {
      File input = new File(args[0]);
      BufferedReader reader = new BufferedReader(new FileReader(input));
      String line;
      
      while ((line = reader.readLine()) != null) {
        String[] tokens = line.split(" ");
        switch (tokens[0]) {
          case "Create":
            mediator.create(tokens[1], tokens[2]);
            break;
          case "Add":
            mediator.add(tokens[1], tokens[2]);
            break;
          case "PrintOutList":
            mediator.traversePrint(tokens[1]);
            break;
          default:
            mediator.command(tokens);
            break;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
