package AutoWiring_Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring_xml {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("autowiring.xml");
        Car c= (Car) applicationContext.getBean("car_o1");
        System.out.println(c);
    }
}
