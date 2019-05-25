public class Projector {
  String state = "off";
  public Projector() {}
  public void turnOn() {
    this.state = "on";
    System.out.println("Turn the projector on");
  }
}

