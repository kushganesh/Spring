package com.JavaAnnotaions;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com/JavaAnnotaions")
public class AnnotaionsClass {
	
	@Bean
	public ArrayList<Integer> s1()
	{
		ArrayList<Integer> a= new ArrayList<>(Arrays.asList(12,34,5,6));
		return a;
	}

}
