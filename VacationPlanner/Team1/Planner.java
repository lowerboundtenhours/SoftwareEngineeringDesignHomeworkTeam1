
public class Planner {
	PlanBuilder planBuilder = null;
	
	public void setPlanner(PlanBuilder planBuilder) {
		this.planBuilder = planBuilder;
	}
	
	public PlanBuilder getPlanBuilder() {
		return this.planBuilder;
	}
	
	public String getPlan() {
		return planBuilder.getPlan().getPlan();
	}
}
