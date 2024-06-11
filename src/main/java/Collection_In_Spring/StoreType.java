package Collection_In_Spring;

public class StoreType {

	private String name;

	public StoreType() {
		super();
	}

	public StoreType(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StoreType [name=" + name + "]";
	}

}
