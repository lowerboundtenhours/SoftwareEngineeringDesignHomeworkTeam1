import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

  DvdPlayer dvdPlayer = new DvdPlayer();
  public static void main(String[] args) {
    HomeTheater homeTheater = new HomeTheater();
    homeTheater.watchMovie();
  }

}
