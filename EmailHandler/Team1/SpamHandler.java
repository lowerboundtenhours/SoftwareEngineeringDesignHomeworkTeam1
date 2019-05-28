public class SpamHandler extends EmailHandler {
    public SpamHandler(EmailHandler next) {
        super(next);
    }

    public void handle(Email email) {
        if (email instanceof Spam) {
            System.out.print("Put mail to the spam box.");
        }
        else {
            this.doNext(email);
        }
    }
}