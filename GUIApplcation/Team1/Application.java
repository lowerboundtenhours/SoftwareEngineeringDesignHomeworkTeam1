
public class Application {
	public Widget[] widgets = new Widget[1000];
	private int widgetNum = 0;
	public WidgetFactory factory = new WidgetFactory();
	
	public void present() {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < widgetNum; ++j) {
				Widget target = null;
				if (i == 0)
					target = new Window();
				else if(i == 1)
					target = new ScrollBar();
				else if (i == 2)
					target = new Button();
				
				if (widgets[j].getClass().equals(target.getClass()))
					widgets[j].present();
			}
		}
	}
	
	public void create(String type, String name) {
		widgets[widgetNum++] = factory.create(type, name);
	}
	
	public void update(String style) {
		for (int i = 0; i < widgetNum; ++i) {
			widgets[i].setStyle(style);
		}
	}
	
}
