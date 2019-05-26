public abstract class EmailHandler {
    protected EmailHandler next;
    public EmailHandler(EmailHandler next) {
        this.next = next;
    }
    public abstract void handle(Email email);

    protected void doNext(Email email) {
        if (this.next != null) {
            this.next.handle(email);
        }
    }
}