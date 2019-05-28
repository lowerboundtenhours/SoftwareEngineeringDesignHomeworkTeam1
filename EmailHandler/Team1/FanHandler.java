public class FanHandler extends EmailHandler {
    public FanHandler(EmailHandler next) {
        super(next);
    }

    public void handle(Email email) {
        if (email instanceof FanEmail) {
            System.out.print("Forward to CEO.");
        } else {
            this.doNext(email);
        }
    }
}