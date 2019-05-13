
public class TexFactory implements TextFormatFactory {
    public Token createPToken() {
        return new TexPToken();
    }

    public Token createFToken() {
        return new TexFToken();
    }

    public Token createCToken() {
        return new TexCToken();
    }
}