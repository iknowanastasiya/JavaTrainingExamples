package com.skillstorm.oop;

public class BasicOOP {

	/*
	 * class: defines state and behavior for objects
	 *  object: instance of class
	 * 
	 */
	
	
	// instance variables
	int number;
	String name;
	
	
	// default constructor
	public BasicOOP() {
		super();
	}

	// parameterized constructor
	public BasicOOP(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	
	// getter and setter methods
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public int addFive() {
		return number + 5;
	}
	
}


/*
 * NOTES
 * 
 * class: defines the state and behavior of an object (blue-print)
 * object: instance of a class
 * 
 * 4 Pillars:
 * 	abstraction
 * 		the idea of only showing the data that needs to be seen
 * 		in java: by using abstract classes and interfaces
 * 			abstract class: gives option to make abstract methods that don't define a method body
 * 			interface: a "class" that is 100% abstract
 * 	encapsulation
 * 		keeping related behaviors into a single class
 * 		using private variables with public getters/setters to control flow of data
 * 	inheritance
 * 		the idea of creating general classes and giving that data to more specific subclasses
 * 			Animal -> Canine -> Dog
 * 		only EXTENDS from one class, or abstract class
 * 		can IMPLEMENTS from multiple interfaces
 * 	polymorphism
 * 		providing methods that can changed at runtime to fit a situation's needs
 * 		method overloading: multiple methods with the same name but different paramters
 * 			add(int, int); add(int, int, int); etc.
 * 		method overriding: when a method in a child class has the same signature as a method in the parent class
 * 			the child's method will have a different implementation that is specific to it
 * 	covariance
 * 		Animal dog = new Dog(); // where Dog is the subclass.
 * 			why?: can change the same Animal object to be of a different subclass
 */