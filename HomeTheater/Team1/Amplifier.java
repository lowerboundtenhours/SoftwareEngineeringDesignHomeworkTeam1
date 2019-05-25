public class Amplifier {
  String state = "off";
  public Amplifier() {}
  public void turnOn() {
    this.state = "on";
    System.out.println("Turn the sound amplifier on");
  }
}
