package Anotaions;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AnotaionClass {

	@Bean
	public Student s1() {
		Student s = new Student();
		s.setId(101);
		s.setName("Ganesh");
		s.setRoll("0191CS201064");
		return s;
	}

}
