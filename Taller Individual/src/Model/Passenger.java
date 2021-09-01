package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Passenger {

	protected String idPassenger;
	protected String firstName;
	protected String lastName;
	protected String country;
	protected LocalDate dateBirthday;
	protected ArrayList tickets;
	
	public Passenger(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday,
			ArrayList tickets) {
		super();
		this.idPassenger = idPassenger;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.dateBirthday = dateBirthday;
		this.tickets = tickets;
	}

	public String getIdPassenger() {
		return idPassenger;
	}

	public void setIdPassenger(String idPassenger) {
		this.idPassenger = idPassenger;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDate getDateBirthday() {
		return dateBirthday;
	}

	public void setDateBirthday(LocalDate dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	public ArrayList getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList tickets) {
		this.tickets = tickets;
	}
	
	public byte getAge() {
		return 0;
		
	}
	
	public boolean addToFly() {
		//entradas fly e short y float
		return false;
	}	
	public double calcOvercrowed() {
		return 0;
	}
	
	public double getTicketCost() {
		return 0;
	
	}
	
	//public ArrayList<Tickets1>getTicket(){
		
	//tg}
	
	
}
