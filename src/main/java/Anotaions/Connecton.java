package Anotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Connecton {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnotaionClass.class);
		Student s = (Student) applicationContext.getBean("s1");
		System.out.println(s);
	}
}
