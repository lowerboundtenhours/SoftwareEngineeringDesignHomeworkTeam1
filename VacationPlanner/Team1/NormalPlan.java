
public class NormalPlan implements Plan{
    private String day;
    private String hotel;
    private String tickets;
    private String reservation;
    private String events;

    public NormalPlan() {
        day = new String("");
        hotel = new String("");
        tickets = new String("");
        reservation = new String("");
        events = new String("");
    }

    public String getPlan() {
        String plan = "NormalVacation\n" + 
                "Day:" + this.day + "\n" +
                "Hotel:" + this.hotel + "\n" +
                "Reservation:" + this.reservation + "\n" +
                "SpecialEvent:" + this.events + "\n" +
                "Tickets:" + this.tickets + "\n";
        return plan;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public void setEvents(String events) {
        this.events = events;
    }
}
