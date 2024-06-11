package Basic_of_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringCfgXml.xml");
		Student s2 = (Student) applicationContext.getBean("s1");
		System.out.print(s2);

	}
}
