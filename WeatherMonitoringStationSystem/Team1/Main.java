import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static HashMap<String, WeatherData> weatherDatas = new HashMap<>();

    private static Display newDisplay(String type) {
        if (type.equals("Current"))
            return new CurrentConditionsDisplay();
        else if (type.equals("Statistics"))
            return new WeatherStatisticsDisplay();
        else if (type.equals("Forecast"))
            return new SimpleForecastDisplay();
        else
            throw new UnsupportedOperationException("Disaply type not found.");
    }

	public static void read_file(String filename) {
		try {
			List<String> allLines = Files.readAllLines(Paths.get(filename));
			for (String line : allLines) {
                String[] words = line.split(" ");
                String command = words[0];
                String area = words[1];

                if (command.equals("data")) {
                    Float temp = Float.parseFloat(words[2]);
                    Float humi = Float.parseFloat(words[3]);
                    Float pres = Float.parseFloat(words[4]);
                    weatherDatas.get(area).update(temp, humi, pres);
                }
                else if (command.equals("attach")) {
                    String type = words[2];
                    Display display = newDisplay(type);
                    weatherDatas.get(area).attach(type, display);
                }
                else if (command.equals("detach")) {
                    String type = words[2];
                    weatherDatas.get(area).detach(type);
                }
                else {
                    throw new UnsupportedOperationException("Command not found.");
                }
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    public static void main(String[] args) { 
        weatherDatas.put("Asia", new WeatherData("Asia"));
        weatherDatas.put("US", new WeatherData("US"));
        String filename = args[0];
        read_file(filename);
    }

}
