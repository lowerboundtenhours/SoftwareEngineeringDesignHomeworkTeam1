import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
    SingleChocolateBoiler singleChocolateBoiler	= SingleChocolateBoiler.getInstance();

		try {
			File input = new File(args[0]);
			BufferedReader reader = new BufferedReader(new FileReader(input));
			String line;
			
			while ((line = reader.readLine()) != null) {
				String[] tokens = line.split(" ");
				
        switch (tokens[0]) {
          case "Fill":
            singleChocolateBoiler.fill();
            break;
          case "Boil":
            singleChocolateBoiler.boil();
            break;
          case "Drain":
            singleChocolateBoiler.drain();
            break;
        }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
