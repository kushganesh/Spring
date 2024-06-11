package Spring_Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring_Jdbc/Spring_Jdbc_.xml");
		First_Dao first_Dao = applicationContext.getBean("s1", First_Dao.class);
		Emp emp = new Emp();
		emp.setName("Govind Gupta");
		emp.setExp(6);
		emp.setSalary("2600091");
		first_Dao.insert(emp);
		;
	}

}
