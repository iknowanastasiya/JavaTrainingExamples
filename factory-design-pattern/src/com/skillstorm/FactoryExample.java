package com.skillstorm;


/*
 * coupling: multiple classes are dependent on one another
 * 		we want low coupling: less dependent 
 * 
 * cohesion: refers the amount of tasks the class is performing
 * 		we want high cohesion: very few tasks
 */

/*
 * DESIGN PATTERN: FACTORY
 * 	problem area:
 * 		- tight coupling of objects
 * 		- really complex object instantiation
 * 
 * 
 * 	solution:
 * 		create a Factory class, that creates objects for you
 * 
 */


public class FactoryExample {
	
	public static void main(String[] args) {

		// our class is now dependent upon the Sword class: high coupling
		//Sword sword = new Sword();
		//sword.attack();
		
		String weaponType = "sword";
		
		
		// now we have low coupling
		Weapon weapon = WeaponFactory.getWeapon(weaponType);
		weapon.attack();
		weapon.damage();
		((Sword) weapon).heal();
		
	
	}

}

class WeaponFactory {
	public static Weapon getWeapon(String type) {
		switch(type) {
			case "sword":
				return new Sword();
			case "gun" :
				return new Gun();
			default:
				throw new IllegalArgumentException("Invalid weapon type");
		}
	}
}


interface Weapon {
	public void attack();
	public void damage();
}

class Sword implements Weapon {

	@Override
	public void attack() {
		System.out.println("slash");
		
	}

	@Override
	public void damage() {
		System.out.println("25 damage");
		
	}
	
	
	public void heal() {
		System.out.println("+5 HP");
	}
	
}

class Gun implements Weapon {

	@Override
	public void attack() {
		System.out.println("pew");
		
	}

	@Override
	public void damage() {
		System.out.println("50 damage");
		
	}
}










