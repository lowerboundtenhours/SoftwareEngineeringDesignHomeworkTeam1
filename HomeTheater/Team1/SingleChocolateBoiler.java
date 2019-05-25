public class SingleChocolateBoiler {
  private static SingleChocolateBoiler singleChocolateBoiler;
  private String state = "empty";

  private SingleChocolateBoiler() {}

  public static SingleChocolateBoiler getInstance() {
    if (singleChocolateBoiler == null) {
      singleChocolateBoiler = new SingleChocolateBoiler();
    }
    return singleChocolateBoiler;
  }

  public void fill() {
    if (this.state == "empty") {
      this.state = "filled";
      System.out.println("Fill chocolate");
    }
  }

  public void boil() {
    if (this.state == "filled") {
      this.state = "boiled";
      System.out.println("Boil chocolate");
    }
  }

  public void drain() {
    if (this.state == "boiled") {
      this.state = "empty";
      System.out.println("Drain the boiled chocolate");
    }
  }

}
