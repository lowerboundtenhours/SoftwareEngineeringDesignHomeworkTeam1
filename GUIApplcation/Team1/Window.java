
public class Window extends Widget{
	public void present() {
		if (this.getStyle().equals("Motif")) {
			System.out.printf("MotifWindow %s\n", this.getName());
		} else if (this.getStyle().equals("PM")) {
			System.out.printf("PMWindow %s\n", this.getName());
		}
	}
}
