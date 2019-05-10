
public abstract class Widget {
	private String style;
	private String name;
	
	public Widget() {
		style = new String("Motif");
	}
	
	public abstract void present();
	
	public String getStyle() {
		return style;
	}
	
	public void setStyle(String style) {
		this.style = style;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
