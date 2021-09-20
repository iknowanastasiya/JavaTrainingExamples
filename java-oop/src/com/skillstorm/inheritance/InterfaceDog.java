package com.skillstorm.inheritance;


// implements keyword used for inheriting from an interface
// can implement as many interfaces as you want in java
public class InterfaceDog implements InterfaceAnimal {

	@Override
	public void sound() {
		System.out.println("woof");
		
	}

	@Override
	public void eat() {
		System.out.println("munch");
		
	}

}
