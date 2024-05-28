package Dependenci_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConnectionFIle {
    public static void main(String[] args) {
        // ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SetterDi.class);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UsingConstructor.class);
        Emp emp = (Emp) applicationContext.getBean("emp");
        System.out.println(emp);
    }

}
