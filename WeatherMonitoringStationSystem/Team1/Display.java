import java.util.LinkedList;

abstract class Display {
    protected LinkedList<Float> temporature;  // NOTE: may need initialization
    protected LinkedList<Float> humidity;
    protected LinkedList<Float> barometricPressure;
    public void update(LinkedList<Float> temporature, LinkedList<Float> humidity,
                       LinkedList<Float> barometricPressure) {
        this.temporature = temporature;
        this.humidity = humidity;
        this.barometricPressure = barometricPressure;
        this.display();
    }
    public abstract void display();

}
