package com.skillstorm.encapsulation;

/**
 * Wrapping related behaviors into one class
 * getter and setter methods with private variables
 */
public class Encapsulation {

	// ACCESS MODIFIERS
	// can be in any order
	
	// only visible within the class
	private int a;
	
	// global access anyone from anywhere can see it
	public int b;
	
	// visible in class, package, and subclasses
	protected int c;
	
	// default: aka package-private - visible anywhere in the package
	int d;

	/*
	 * only initialized once at the start of the execution, before any instance variables
	 * Every instance (object) is going to use the exact same copy
	 * classname.varName
	 */
	static private int e;
	
	/*
	 * value cannot be changed, and must be declared when initialized
	 */
	private final int f = 0;



	public Encapsulation() {
		super();
	}

	public Encapsulation(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
	
}
