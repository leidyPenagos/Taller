package Model;

public class Ticket {

	private String chairNumber;
	private boolean baggage;
	private float weight;
	Fly fly;
	Passenger passenger;
	
	/*public Ticket(String chairNumber, boolean baggage, float weight) {
		super();
		this.chairNumber = chairNumber;
		this.baggage = baggage;
		this.weight = weight;
	}*/
	
	public Ticket() {
		//entradas fly, passenger, weight, short
		// fly, passenger, short
	}

	public String getChairNumber() {
		return chairNumber;
	}

	public void setChairNumber(String chairNumber) {
		this.chairNumber = chairNumber;
	}

	public boolean isBaggage() {
		return baggage;
	}

	public void setBaggage(boolean baggage) {
		this.baggage = baggage;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Fly getFly() {
		return fly;
	}

	public void setFly(Fly fly) {
		this.fly = fly;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
	
	
}
