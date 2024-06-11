//package SpringJdbc;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import SpringJdbc.dao.DataBaseConnection;
//
//public class ConnectionClass {
//	public static void main(String[] args) {
//
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringJdbc/Jdbc.xml");
//	
//		DataBaseConnection baseConnection = (DataBaseConnection) applicationContext.getBean("s1");
//
//		Student s = new Student();
//		s.setId(102);
//		s.setName("Jk");
//		s.setRoll("0191CS201070");
//
//		int t = baseConnection.insert(s);
//		System.out.println(t);
//		
//		Student s1 = new Student();
//		s1.setId(103);
//		s1.setName("pk");
//		s1.setRoll("0191CS201071");
//
//		int t1 = baseConnection.insert(s1);
//		System.out.println(t1);
//		Student s2 = new Student();
//		s2.setId(104);
//		s2.setName("mk");
//		s2.setRoll("0191CS201072");
//
//		int t2 = baseConnection.insert(s2);
//		System.out.println(t2);
//		Student s3 = new Student();
//		s3.setId(105);
//		s3.setName("kl");
//		s3.setRoll("0191CS201073");
//
//		int t3 = baseConnection.insert(s3);
//		System.out.println(t3);
//
//	}
//
//}
