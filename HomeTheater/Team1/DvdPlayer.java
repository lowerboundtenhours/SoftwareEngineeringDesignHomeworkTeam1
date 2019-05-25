public class DvdPlayer {
  String state = "off";
  public DvdPlayer() {}
  public void turnOn() {
    this.state = "on";
    System.out.println("Turn the DVD player on");
  }
  public void play() {
    this.state = "play";
    System.out.println("Start the DVD player playing");
  }
}
