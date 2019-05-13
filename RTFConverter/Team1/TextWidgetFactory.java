
public class TextWidgetFactory implements TextFormatFactory {
    public Token createPToken() {
        return new TextWidgetPToken();
    }

    public Token createFToken() {
        return new TextWidgetFToken();
    }

    public Token createCToken() {
        return new TextWidgetCToken();
    }
}