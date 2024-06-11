package com.JavaAnnotaions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class Student {

	@Value("Ganesh Kushwah")
	private String name;
	@Value("Mohit Kushwah")
	private String roll;
	@Value("34")
	private int age;
	
	
	private Addresh as;
	
	@Autowired
	private List<Integer>ans;

	
	
	public List<Integer> getAns() {
		return ans;
	}

	public void setAns(List<Integer> ans) {
		this.ans = ans;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", age=" + age + ", ans=" + ans + "]";
	}



}
