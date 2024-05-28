package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String loacation="applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(loacation);
        Student student = (Student) applicationContext.getBean("student01");
        System.out.println(student);

    }
}
