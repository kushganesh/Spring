package Aunotaion_autowiring_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {
	
	private B b;

	public B getB() {
		return b;
	}
	
//	@Autowired
//	@Qualifier("c")
	public void setB(B b) {
		this.b = b;
	}

	@Autowired
	public A(@Qualifier("c") B b) {
		super();
		this.b = b;
	}

	public A() {
		super();
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
}
