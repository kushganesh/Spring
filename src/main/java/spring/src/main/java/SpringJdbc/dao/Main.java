package SpringJdbc.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"SpringJdbc/dao/Jdbc_connections.xml");
		DataBaseConnection p = applicationContext.getBean("gk", DataBaseConnection.class);
		Student student = new Student();
		student.setId(10011001);
		student.setName("Ganesh Table");
		student.setRoll("0191CS201064");
		int t = p.insert(student);
		System.out.println(t);

		System.out.println("Ganesh kushwah Mohanpur");
	}
}
