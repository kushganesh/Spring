package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringConnection {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Autowiring_Conf.class);
        Collage c = (Collage) applicationContext.getBean("clg");
        System.out.println(c);
    }
}
