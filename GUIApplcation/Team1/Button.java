
public class Button extends Widget {
	public void present() {
		if (this.getStyle().equals("Motif")) {
			System.out.printf("MotifButton %s\n", this.getName());
		} else if (this.getStyle().equals("PM")) {
			System.out.printf("PMButton %s\n", this.getName());
		}
	}
}
