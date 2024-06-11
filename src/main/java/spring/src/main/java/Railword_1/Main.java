package Railword_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Railword_1/ApplicationXml.xml");
		 Student s= (Student) applicationContext.getBean("s1");
		 System.out.println(s);
	}

}
