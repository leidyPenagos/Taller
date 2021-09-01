package Model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Fly {

	private String idFly;
	private LocalDate date;
	private LocalTime time;
	private Airplane airplane;
	private Target target;
	private ArrayList<Ticket> tickets;
	
	public Fly(String idFly, LocalDate date, LocalTime time, Airplane airplane, Target target,
			ArrayList<Ticket> tickets) {
		super();
		this.idFly = idFly;
		this.date = date;
		this.time = time;
		this.airplane = airplane;
		this.target = target;
		this.tickets = tickets;
	}

	public String getIdFly() {
		return idFly;
	}

	public void setIdFly(String idFly) {
		this.idFly = idFly;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public ArrayList<Ticket> getTicket() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	public Boolean addPassenger() {
		return null;
	//entradas passenger, short y float	
	}
	
	public double calcTotal() {
		return 0;
		
	}
	
	public Passenger getLessAge() {
		return null;
		
	}
	
	public Passenger GreaterAge() {
		return null;
		
	}
	
	/*public ArrayList<Ticket> getTickets(){
		
	}*/
	
	
}
