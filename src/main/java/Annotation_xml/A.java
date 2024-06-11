package Annotation_xml;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	private B b;

	public A() {
		super();
	}

	@Autowired
	public A(B b) {
		super();
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}

}
