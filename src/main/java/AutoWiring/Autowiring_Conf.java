package AutoWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Autowiring_Conf {


    @Bean
    public Professors ps() {
        Professors professors = new Professors();
        professors.setName("Ganesh");
        professors.setExp("5");
        professors.setSal("30000");
        return professors;
    }

    @Bean
    public Professors ps1() {
        Professors professors = new Professors();
        professors.setName("Rajesh");
        professors.setExp("9");
        professors.setSal("200");
        return professors;
    }

    @Bean
    public Collage clg() {
        Collage clg1 = new Collage();
        clg1.setName("TiT Behan");
        return clg1;
    }
}
