import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WeatherStatisticsDisplay extends Display {
    public void display () {
        String[] texts = {"Temperature", "Humidity", "Pressure"};
        ArrayList<LinkedList<Float>> statistics = new ArrayList<LinkedList<Float>>();
        statistics.add(this.temporature);
        statistics.add(this.humidity);
        statistics.add(this.barometricPressure);

        for (int i = 0; i < 3; i += 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(texts[i]);
            LinkedList<Float> stat = statistics.get(i);
            for (Float num: stat)
                sb.append(String.format(" %.1f", num));
            System.out.println(sb.toString());
        }
    }
}
