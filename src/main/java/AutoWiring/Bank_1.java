package AutoWiring;

public class Bank_1 {
	private String name;
	private Client client;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Bank_1(String name, Client client) {
		super();
		this.name = name;
		this.client = client;
	}

	public Bank_1() {
		super();
	}

	@Override
	public String toString() {
		return "Bank_1 [name=" + name + ", client=" + client + "]";
	}

}
