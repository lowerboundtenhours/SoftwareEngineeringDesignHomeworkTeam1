public class CurrentConditionsDisplay extends Display {
    public void display () {
        String[] texts = {"Temperature", "Humidity", "Pressure"};
        float[] nums = {temporature.getLast(), humidity.getLast(), barometricPressure.getLast()};
        for (int i = 0; i < 3; i += 1) {
            System.out.printf("%s %.1f\n", texts[i], nums[i]);
        }
    }

}
