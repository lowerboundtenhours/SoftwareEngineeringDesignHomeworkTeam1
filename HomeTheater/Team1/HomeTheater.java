public class HomeTheater {

  TheaterLights theaterLights = new TheaterLights();
  PopcornPopper popcornPopper =  new PopcornPopper();
  Projector projector = new Projector();
  DvdPlayer dvdPlayer = new DvdPlayer();
  Screen screen = new Screen();
  Amplifier amplifier = new Amplifier();
  public HomeTheater() {

  }

  public void watchMovie() {
    this.popcornPopper.turnOn();
    this.popcornPopper.start();
    this.theaterLights.dim();
    this.screen.putDown();
    this.projector.turnOn();
    this.amplifier.turnOn();
    this.dvdPlayer.turnOn();
    this.dvdPlayer.play();

  }
}
