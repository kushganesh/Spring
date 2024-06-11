package Data_injection_xml;

public class Student {
	private String name;
	private String roll;
	private Address adress;

	public Student()
	{

	}

	public Student(String name, String roll, Address adress) {
		super();
		this.name = name;
		this.roll = roll;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", adress=" + adress + "]";
	}

}
