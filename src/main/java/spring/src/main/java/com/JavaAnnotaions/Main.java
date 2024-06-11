package com.JavaAnnotaions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

   ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AnnotaionsClass.class);
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
//				"com/JavaAnnotaions/AnnotaionsXmlFile.xml");
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student);
	}
}
