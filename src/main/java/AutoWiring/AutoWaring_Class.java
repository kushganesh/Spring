package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWaring_Class {
	public static void main(String[] args) {
		@SuppressWarnings(""
				+ "resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AutoWiring/AutoWiring.xml");
		Bank_1 bank = (Bank_1) applicationContext.getBean("s1");
//		for (Client client : bank.getClient()) {
//			System.out.println("Client Name: " + client.getName() + ", Profession: " + client.getProfession());
//		}
		System.out.println(bank);

	}
}
