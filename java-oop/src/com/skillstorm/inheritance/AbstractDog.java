package com.skillstorm.inheritance;



public class AbstractDog extends AbstractAnimal {

	// abstract methods must be overridden to provide the implementation
	@Override
	public void eat() {
		System.out.println("nom nom");
	}

}
