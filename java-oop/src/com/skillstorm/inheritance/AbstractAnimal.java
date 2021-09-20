package com.skillstorm.inheritance;

/*
 * abstraction: the idea of only showing the data that needs to be seen
 * 
 */
public abstract class AbstractAnimal {
	private int mass;
	private String name;
	
	
	public AbstractAnimal() {
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
		System.out.println("grrr");
	}
	
	public abstract void eat();
}
