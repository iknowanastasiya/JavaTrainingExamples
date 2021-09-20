package com.skillstorm.polymorphism;

public class Wolf {
	private int mass;
	private String name;
	
	
	
	public Wolf() {
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
	
	
	// method overloading: functions with the same name, but different paramters
	public void sound(String sound) {
		System.out.println(sound);
	}
}
