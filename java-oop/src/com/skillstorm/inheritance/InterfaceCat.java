package com.skillstorm.inheritance;

public class InterfaceCat implements InterfaceAnimal{

	@Override
	public void sound() {
		System.out.println("meow");
		
	}

	@Override
	public void eat() {
		System.out.println("lick");
		
	}

}
