package Scop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class C {
	public static void main(String[] args) {
   
	 ApplicationContext applicationContext= new AnnotationConfigApplicationContext(B.class);
	   A a= (A)applicationContext.getBean("a");
	   System.out.print(a.hashCode());
	   System.out.println();
	   A a1= (A)applicationContext.getBean("a");
	   System.out.print(a1.hashCode());
	}
}
