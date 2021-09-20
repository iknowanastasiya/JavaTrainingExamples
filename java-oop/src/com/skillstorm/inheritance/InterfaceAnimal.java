package com.skillstorm.inheritance;

/*
 * ABSTRACTION
 * functionality is stated but not implemented
 * everything is public and abstract by default
 * 
 * 
 * what a class DOES: 
 *	'-able': Huntable, runnable, playable etc.
 */
public interface InterfaceAnimal {
	
	// all methods in an interface are abstract by default
	public void sound();
	
	public void eat();
}
