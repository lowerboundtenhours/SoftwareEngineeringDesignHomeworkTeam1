public class TheaterLights {
  String state = "on";
  public TheaterLights() {}
  public void dim() {
    this.state = "dim";
    System.out.println("Dim the lights");
  }
}

