package Life_Cycle_Beam;

public class Example_1 {
	private String name;
	private int age;

	public Example_1() {
	}

	public Example_1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(name + " " + "name is enterd");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println(age + " " + "age is enterd");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Example_1 [name=" + name + ", age=" + age + "]";
	}

	public void init() {
		System.out.println("Ganesh this is the init method");
	}

	public void destroy() {
		System.out.println("Ganesh this is the destroy method");
	}
}
