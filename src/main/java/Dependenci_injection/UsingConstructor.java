package Dependenci_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsingConstructor {

    @Bean
    public Address address1() {
        Address s = new Address("Madhya Pradesh", "Khandwa", "Pandhana", "Mohanpur");
        return s;
    }


    @Bean
    public Emp emp() {
        Emp emp = new Emp("Gopal", "101", "10000", address1());
        return emp;
    }
}
