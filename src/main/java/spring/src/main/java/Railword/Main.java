package Railword;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Anotaions.AnotaionClass;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Railword.AnotaionClass.class);
   
		 Student s= (Student) applicationContext.getBean("s1");
		 System.out.println(s);
	}

}
