package com.skillstorm.inheritance;


/*
 *INHERITANCE
 *
 * IS-A
 * Dog is a Animal
 * Cat is a Animal
 */
public class Animal {
	private int mass;
	private String name;
	
	
	
	public Animal() {
		super();
	}
	
	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void sound() {
		System.out.println("default_sound");
	}
}
