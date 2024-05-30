package Scop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class B {

	@Bean
	public A a()
	{
		A a= new A();
		a.setName("Ganesh");
		a.setRoll("0191CS201064");
		return a;
	}
}
