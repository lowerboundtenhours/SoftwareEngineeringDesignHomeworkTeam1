
public class ScrollBar extends Widget {
	public void present() {
		if (this.getStyle().equals("Motif")) {
			System.out.printf("MotifScrollBar %s\n", this.getName());
		} else if (this.getStyle().equals("PM")) {
			System.out.printf("PMScrollBar %s\n", this.getName());
		}
	}
}
