package Java_Configuration_File;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Java_Congiguration_file {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring.class);
        Student student = (Student) applicationContext.getBean("std");
        System.out.println(student);

        Student s2 = (Student) applicationContext.getBean("std1");
        System.out.println(s2);
    }


}
