import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void read_file(String filename) {
		try {
			List<String> allLines = Files.readAllLines(Paths.get(filename));
            Composer composer = new Composer();

			for (String line : allLines) {
                String[] words = line.split(" ");
                String command = words[0];
                switch (command) {
                    case "Text":
                        Component text = new Text(
                            words[1], Integer.parseInt(words[2]),
                            Integer.parseInt(words[3]), Integer.parseInt(words[4]), words[5]
                        );
                        composer.addComponent(words[1], text);
                        break;
                    case "GraphicalElement":
                        Component graphicalElement = new GraphicalElement(
                            words[1], Integer.parseInt(words[2]),
                            Integer.parseInt(words[3]), Integer.parseInt(words[4]), words[5]
                        );
                        composer.addComponent(words[1], graphicalElement);
                        break;
                    case "ChangeSize":
                        composer.changeSize(words[1], Integer.parseInt(words[2]));
                        break;
                    case "Require":
                        composer.setComposition(words[1]);
                        composer.compose();
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
