package Collection_In_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Connection {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Collection_In_Spring/using_Util_and_P.Xml");
//		StoreType s= (StoreType) applicationContext.getBean("d1");

		Store s1= (Store) applicationContext.getBean("s1");
		System.out.println(s1);
		
	}

}
