
public class WidgetFactory {
	public Widget create(String type, String name) {
		Widget widget = null;
		if (type.equals("Window"))
			widget = new Window();
		else if (type.equals("ScrollBar"))
			widget = new ScrollBar();
		else if (type.equals("Button"))
			widget = new Button();
		
		widget.setName(name);
		return widget;
	}
}
