public class PopcornPopper {
  String state = "off";
  public PopcornPopper() {}
  public void turnOn() {
    this.state = "on";
    System.out.println("Turn on the popcorn popper");
  }
  public void start() {
    this.state = "start";
    System.out.println("Start the popper popping");
  }
}
