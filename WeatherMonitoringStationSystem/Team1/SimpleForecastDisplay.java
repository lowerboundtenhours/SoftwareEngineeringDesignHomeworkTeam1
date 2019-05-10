public class SimpleForecastDisplay extends Display {
    public void display () {
        float num = this.humidity.getLast();
        if (num > 0.8)
            System.out.println("Forecast rain.");
        else if (num < 0.2)
            System.out.println("Forecast sunny.");
        else
            System.out.println("Forecast cloudy.");
    }

}
