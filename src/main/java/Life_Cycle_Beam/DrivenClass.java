package Life_Cycle_Beam;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrivenClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Life_Cycle_Beam/ByXmlLifeCycle.xml");
		Example_1 example_1 = (Example_1) applicationContext.getBean("s1");
		System.out.println(example_1);
		applicationContext.close();
		

	}

}
