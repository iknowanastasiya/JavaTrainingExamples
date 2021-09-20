package com.skillstorm.encapsulation;

import com.skillstorm.inheritance.AbstractDog;
import com.skillstorm.inheritance.Animal;
import com.skillstorm.inheritance.Dog;
import com.skillstorm.inheritance.InterfaceCat;
import com.skillstorm.inheritance.InterfaceDog;
import com.skillstorm.polymorphism.Canine;
import com.skillstorm.polymorphism.Wolf;

public class HelloWorld {

	static public void main(String[] args) {
		
		/*
		//System.out.println("Hello World!!!!!");
		
		Person person1 = new Person(18, "Joe");
		//Person person2 = new Person(-1, "Sue");
		
		
		person1.setAge(-1);
		System.out.println(person1.getAge());
		//System.out.println(person2.getAge());
		 */
		/*
		Animal animal = new Animal();
		Dog hound = new Dog();
		
		AbstractDog aDog = new AbstractDog();
		InterfaceDog iDog = new InterfaceDog();
		InterfaceCat iCat = new InterfaceCat();
		
		hound.setMass(30);
		hound.setName("Ralph");
		
		animal.sound();
		hound.sound();
		aDog.eat();
		
		
		iDog.eat();
		iDog.sound();
		iCat.eat();
		iCat.sound();
		
		*/
		
		Wolf wolf = new Wolf();
		
		// method overloading
		wolf.sound();
		wolf.sound("howl");
		
		
		//Canine canine = new Wolf();
		// covariance (covariant reference)
		Wolf canine = new Canine();
		
		
	}

}
