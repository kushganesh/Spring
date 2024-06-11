package Railword;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotaionClass {

	@Bean
	public Student s1() {
		Student s = new Student();
		s.setId(101);
		s.setName("Ganesh");

		return s;
	}

	@Bean
	public Address a1() {
		Address a = new Address();
		a.setDist("Khandwa");
		a.setPost("Goradiya");
		a.setVillage("Moahanpur");
		return a;
	}
}
