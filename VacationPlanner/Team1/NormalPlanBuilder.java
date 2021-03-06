
public class NormalPlanBuilder implements PlanBuilder{
    NormalPlan plan = new NormalPlan();
    
    public void setDay(String day) {
        plan.setDay(day);
    }
    
    public void setHotel(String hotel) {
        plan.setHotel(hotel);
    }
    
    public void setTickets(String tickets) {
        plan.setTickets(tickets);
    }
    
    public void setReservation(String reservation) {
        plan.setReservation(reservation);
    }
    
    public void setEvents(String events) {
        plan.setEvents(events);
    }

    public Plan getPlan() {
        return plan;
    }
}
