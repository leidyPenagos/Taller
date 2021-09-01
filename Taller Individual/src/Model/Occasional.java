package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Occasional extends Passenger {

	private LocalDate dateLastFly;
	

	public Occasional(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday,
			ArrayList tickets, LocalDate dateLastFly) {
		super(idPassenger, firstName, lastName, country, dateBirthday, tickets);
		this.dateLastFly = dateLastFly;
	}

	public LocalDate getDateLastFly() {
		return dateLastFly;
	}

	public void setDateLastFly(LocalDate dateLastFly) {
		this.dateLastFly = dateLastFly;
	}
	
	public double getTicketCost() {
		return 0;
		
	}
	
	
}
