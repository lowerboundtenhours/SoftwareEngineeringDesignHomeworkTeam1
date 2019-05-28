public class Screen {

  String state = "up";
  public Screen() {}

  public void putDown() {
    this.state = "down";
    System.out.println("Put the screen down");
  }
}
