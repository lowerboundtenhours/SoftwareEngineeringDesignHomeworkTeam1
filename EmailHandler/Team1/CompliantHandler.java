public class CompliantHandler extends EmailHandler {
    public CompliantHandler(EmailHandler next) {
        super(next);
    }

    public void handle(Email email) {
        if (email instanceof CompliantMail) {
            System.out.print("Forward to legal department.");
        } else {
            this.doNext(email);
        }
    }
}