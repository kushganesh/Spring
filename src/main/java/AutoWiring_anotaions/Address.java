package AutoWiring_anotaions;

public class Address {

	private String city;
	private String dist;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public Address() {
		super();
	}

	public Address(String city, String dist) {
		super();
		this.city = city;
		this.dist = dist;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", dist=" + dist + "]";
	}

}
