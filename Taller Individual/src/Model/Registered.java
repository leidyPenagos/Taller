package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Registered extends Passenger {
	

	private double miles;
	private float discount=15;
	private LocalDate dateRegister;

	public Registered(String idPassenger, String firstName, String lastName, String country, LocalDate dateBirthday,
			ArrayList tickets) {
		super(idPassenger, firstName, lastName, country, dateBirthday, tickets);
		// TODO Auto-generated constructor stub
	}


	public double getMiles() {
		return miles;
	}


	public void setMiles(double miles) {
		this.miles = miles;
	}


	public float getDiscount() {
		return discount;
	}


	public void setDiscount(float discount) {
		this.discount = discount;
	}


	public LocalDate getDateRegister() {
		return dateRegister;
	}


	public void setDateRegister(LocalDate dateRegister) {
		this.dateRegister = dateRegister;
	}
	
	public double getTicketCost() {
		return 0;
	}
	
	
	
}
