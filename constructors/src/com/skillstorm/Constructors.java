package com.skillstorm;

public class Constructors {

	public static void main(String[] args) {
		/*
		 * DEFAULT VALUES & PRIMITIVE TYPES
		 * java has 8 primitive types: int, short, long, float, double, byte, char, boolean
		 * numbers have a range of -2^(n-1) through (2^(n-1))-1
		 * 	where n is the number of bits 
		 */
		
		// each assigned to their default values
		int normalNumber = 0;			// 32 bits
		short smallNumber = 0;			// 16 bits
		byte reallySmallNumber = 0;		// 8 bits
		long bigNumber = 0L;			// 64 bits
		float normalDecimal = 0.0f;		// 32 bits
		double bigDecimal = 0.0;		// 64 bits
		char singleCharacter = 0;		// 16 bits
		boolean isTrueOrFalse = false;	// 8 bits
		
		
		/*
		 * TYPE CONVERSIONS
		 */
		
		// widening (automatic) conversions: smaller to larger
		// byte -> short -> int -> long -> float -> double
		int i = 12;
		double d = i;
		//System.out.println("int: " + i);		// 12
		//System.out.println("double: " + d);		// 12.0
		
		
		// narrowing (explicit) conversions: larger to smaller
		// double -> float -> long -> int -> short -> byte
		float f = 100.7f;
		byte b = (byte) f;
		//System.out.println("float: " + f);		// 100.7
		//System.out.println("byte: " + b);		// 100
		
		
		// CONSTRUCTOR
		//Animal a1 = new Animal();
		//System.out.println("--------");
		//Animal a2 = new Animal(34);
		
		Wolf w = new Wolf();
		System.out.println(w);
		
	}

}


/*
 * CONSTRUCTOR CHAINING
 * calling one constructor from a different constructor
 */

class Animal {		// extends java.lang.Object implicitly
	int mass;
	String name;
	
	public void setMass(int mass) {
		if(mass > 0) {
			this.mass = mass;
		}
	}
	
	
	// default constructors (implicit constructors)
	// what it looks like:
		// takes no parameters (no-arg constructor)
		// sets primitive types to their defualt values
		// sets objects to null
	public Animal() {
		super();		// calls the constructor of the parent class
		this.mass = 0;
		this.name = null;
		
		System.out.println("Animal()");
	}
	
	// constructor overloading
	public Animal(int mass) {
		// first line of any constructor, MUST BE super() or this()
		this();			// call the no-arg constructor in the same class (must define one)
		this.mass = mass;
		
		System.out.println("Animal(int mass)");		
	}

}

class Canine extends Animal {
	String breed;

	public Canine() {
		super(56);			// call the paramterized constructor in the parent class
		this.name = "Baxter";
		
		
		System.out.println("Canine()");
	}
}


class Wolf extends Canine {
	public Wolf() {
		// super will be implicitly called
		this.breed = "Husky";
		
		System.out.println("Wolf()");
	}

	@Override
	public String toString() {
		return "Wolf [breed=" + breed + ", mass=" + mass + ", name=" + name + "]";
	}
}


















