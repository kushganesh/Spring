package AutoWiring_anotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Connection {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnotaionClass.class);
		Student s1 = (Student) applicationContext.getBean("s1");
		System.out.println(s1);

	}
}
