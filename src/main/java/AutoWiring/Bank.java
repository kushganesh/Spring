package AutoWiring;

import java.util.List;

public class Bank {
	private String name;
	private List<Client> client;

	public Bank() {
		super();
	}

	public Bank(String name, List<Client> client) {
		super();
		this.name = name;
		this.client = client;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", client=" + client + "]";
	}

}
