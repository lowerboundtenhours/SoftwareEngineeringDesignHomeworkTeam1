import java.util.LinkedList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WeatherData {
    private String area;
    private LinkedList<Float> temporature = new LinkedList<Float>();
    private LinkedList<Float> humidity = new LinkedList<Float>();
    private LinkedList<Float> barometricPressure = new LinkedList<Float>();
    private LinkedHashMap<String, Display> displays = new LinkedHashMap<String, Display>();

    public WeatherData(String area) {
        this.area = area;
    }

    public void attach(String name, Display display) {
        this.displays.put(name, display);
    }

    public void detach(String name) {
        this.displays.remove(name);
    }

    public void notify_() {
        for (Map.Entry<String, Display> entry : this.displays.entrySet()) {
            entry.getValue().update(this.temporature, this.humidity, this.barometricPressure);
        }
    }
    public void update(Float temporature, Float humidity, Float barometricPressure) {
        this.temporature.add(temporature);
        this.humidity.add(humidity);
        this.barometricPressure.add(barometricPressure);
        this.notify_();
    }

}
