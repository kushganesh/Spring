package DI_By_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Connetion {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("./DI_By_XML/DI.xml");
        Student s= (Student) applicationContext.getBean("student1");
        System.out.println(s);
    }
}
