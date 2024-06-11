package Spring_Jdbc;

public class Emp {
	private String name;
	private String salary;
	private int exp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Emp(String name, String salary, int exp) {
		super();
		this.name = name;
		this.salary = salary;
		this.exp = exp;
	}

	public Emp() {
		super();
	}

}
