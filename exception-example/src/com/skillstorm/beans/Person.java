package com.skillstorm.beans;

import com.skillstorm.exceptions.InvalidPersonAgeException;

// bean refers to java bean (like the coffee)
// POJO: plain old java object


public class Person {
	
	private int age;
	private String name;
	
	public Person() {
		super();
	}
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	// throws: tell other methods to expect the exception
	public void setAge(int age) throws IllegalArgumentException, InvalidPersonAgeException {
		
		if(age > 0) {
			this.age = age;
		}
		else if (age == 0) {
			throw new InvalidPersonAgeException("Age cannot be zero!!");
		}
		else {
			// throw: "creates" the exception
			throw new IllegalArgumentException("Age cannot be negative!");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
