package DI_Aunotaion;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AnotaionClass {
	@Bean
	public Student s1() {
		Student s1 = new Student();
		s1.setId("101");
		s1.setName("Ganesh");
		s1.setRoll("0191CS20164");
		s1.setAddress(a1());
		return s1;
	}

	@Bean
	public Address a1() {
		Address s = new Address();
		s.setCity("Khandwa");
		s.setDist("Khandwa");
		return s;
	}
}
