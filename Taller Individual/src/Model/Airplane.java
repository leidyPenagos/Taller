package Model;

public class Airplane {

	private String idAirplane;
	private short capacity;
	private short year;
	private EtypeAirplane tipeAirplane;
	
	public Airplane(String idAirplane, short capacity, short year, EtypeAirplane tipeAirplane) {
		super();
		this.idAirplane = idAirplane;
		this.capacity = capacity;
		this.year = year;
		this.tipeAirplane = tipeAirplane;
	}

	public String getIdAirplane() {
		return idAirplane;
	}

	public void setIdAirplane(String idAirplane) {
		this.idAirplane = idAirplane;
	}

	public short getCapacity() {
		return capacity;
	}

	public void setCapacity(short capacity) {
		this.capacity = capacity;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public EtypeAirplane getTipeAirplane() {
		return tipeAirplane;
	}

	public void setTipeAirplane(EtypeAirplane tipeAirplane) {
		this.tipeAirplane = tipeAirplane;
	}

	@Override
	public String toString() {
		return "Airplane [idAirplane=" + idAirplane + ", capacity=" + capacity + ", year=" + year + ", tipeAirplane="
				+ tipeAirplane + "]";
	}
	
	
	
	
	
}
