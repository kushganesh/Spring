package Scop;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class A {
	private String name;
	private String roll;

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

	@Override
	public String toString() {
		return "A [name=" + name + ", roll=" + roll + "]";
	}

}
