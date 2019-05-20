import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File input = new File(args[0]);
			BufferedReader reader = new BufferedReader(new FileReader(input)); 
			String line;
			Planner planner = null;
			
			while((line = reader.readLine()) != null) {
				String tokens[] = line.split(" ");
				
				if ((tokens[0].equals("Backpacking"))) {
					if (planner != null)
						System.out.print(planner.getPlan());
					else
						planner = new Planner();
					planner.setPlanner(new BackpackingPlanBuilder());
				} else if (tokens[0].equals("Normal")) {
					if (planner != null)
						System.out.print(planner.getPlan());
					else
						planner = new Planner();
					planner.setPlanner(new NormalPlanBuilder());
				} else if (tokens[0].equals("Day")) {
					planner.getPlanBuilder().setDay(tokens[1]);
				} else if (tokens[0].equals("SpecialEvent")) {
					planner.getPlanBuilder().setEvents(tokens[1]);
				} else if (tokens[0].equals("Hotel")) {
					planner.getPlanBuilder().setHotel(tokens[1]);
				} else if (tokens[0].equals("Reservation")) {
					planner.getPlanBuilder().setReservation(tokens[1]);
				} else if (tokens[0].equals("Tickets")) {
					planner.getPlanBuilder().setTickets(tokens[1]);
				}
			}
			System.out.print(planner.getPlan());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
