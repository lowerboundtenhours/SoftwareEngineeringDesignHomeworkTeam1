import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = new Application();
		String style = new String("Motif");
		
		try {
			File input = new File(args[0]);
			BufferedReader reader = new BufferedReader(new FileReader(input));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split(" ");
				
				if ((tokens[0].equals("Window")) || (tokens[0].equals("ScrollBar")) || (tokens[0].equals("Button"))) {
					app.create(tokens[0], tokens[1]);
					app.update(style);
				} else if (tokens[0].equals("Present")) {
					app.present();
				} else if (tokens[0].equals("PM")) {
					app.update(tokens[0]);
					style = tokens[0];
				} else if (tokens[0].equals("Motif")) {
					app.update(tokens[0]);
					style = tokens[0];
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
