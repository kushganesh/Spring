package AutoWiring;

public class Client {
	private String name;
	private String profession;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Client(String name, String profession) {
		super();
		this.name = name;
		this.profession = profession;
	}

	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", profession=" + profession + "]";
	}

}
