package Data_injection_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Setter_Method_Injection {
	public static void main(String[] args) {
	
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Data_injection_xml/Data_Injection_Xml.xml");
		Student s = (Student) applicationContext.getBean("st1");
		System.out.println(s);

	}

}
