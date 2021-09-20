package com.skillstorm.inheritance;

/* 
 * INHERITANCE: creating general class that can pass general information down to 
 * more specific subclasses
 * can only extend from one class in java
 */
public class Dog extends Animal{

	// method overriding POLYMORPHISM
	@Override
	public void sound() {
		System.out.println("Bark!");
	}
}
