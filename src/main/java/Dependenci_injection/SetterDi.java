package Dependenci_injection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterDi {

    @Bean
    public Emp emp() {
        Emp emp1 = new Emp();
        emp1.setEmpId("101");
        emp1.setName("Ganesh");
        emp1.setAddress(address());
        return emp1;

    }

    @Bean
    public Address address() {
        Address address1 = new Address();
        address1.setBlock("Pandhana");
        address1.setDistrict("Khandwa");
        address1.setState("Madhya Pradesh");
        address1.setVillage("Moahanpur");

        return address1;
    }
}
