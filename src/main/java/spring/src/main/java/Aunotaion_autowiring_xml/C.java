package Aunotaion_autowiring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class C {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"Aunotaion_autowiring_xml/Aanotaion.xml");
		A a = (A) applicationContext.getBean("a");
		System.out.println(a);
		System.out.println("I am Working");
	}
}
