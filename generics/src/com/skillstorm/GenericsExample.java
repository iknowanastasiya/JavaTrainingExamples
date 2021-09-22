package com.skillstorm;

public class GenericsExample {

	/*
	 * GENERICS
	 * 	allow for "temporary" types
	 * 		a method or class can work with multiple types, but still have
	 * 		compile time type safety
	 * 	only going to work with objects, not primitives
	 * 
	 * 	E - elements
	 * 	K - keys
	 * 	N - numbers
	 * 	T - type
	 * 	V - value
	 * 
	 * WRAPPER CLASSES
	 * 	built in objects that represent primitive types
	 * 	Integer, Short, Long, Byte, Float, Double, Boolean, Character
	 * 
	 * 	autoboxing: convert primitive types into wrapper classes
	 * 	unboxing:	convert wrapper classes into primitive types
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		Integer[] intArray = {2, 4, 6, 8};
		String[] stringArray = {"two", "four", "six", "eight"};
		
		printArray(intArray);
		printArray(stringArray);
	}
	
	
	public static <E> void printArray( E[] inputArray) {
		
		for(E element : inputArray) {
			System.out.println(element);
		}
		System.out.println();
	}
	
	

}
