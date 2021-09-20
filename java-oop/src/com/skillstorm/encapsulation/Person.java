package com.skillstorm.encapsulation;

public class Person {

	
	private int age;		// age of the person
	private String name;	// name of the person
	
	
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
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;
		}
		else {
			this.age = 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
