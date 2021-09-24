package com.skillstorm;

public class GroceryStore {

	public static void main(String[] args) {
		
		
		GroceryStore gs = new GroceryStore();
		
		System.out.println(gs.validateAge(12, "lottery"));
		
	}
	
	
	/*
	 * 
	 * age validator
	 * 		21+ : alcohol
	 * 		18+ : lottery tickets
	 * 		17- : only unrestricted items
	 * 
	 * test driven development (TDD)
	 * 		write tests first, then write code to pass those tests
	 * 
	 */
	public boolean validateAge(int age, String product) {
		
		switch(product) {
			case "alcohol" :
				
				/*
				 * if(age >= 21) {
				 * 	return true;
				 * }
				 * else {
				 * 	return false;
				 * }
				 * 
				 * same as below: ternary operator
				 * 
				 * 	(boolean condition) ? (what to return when true) : (what to return when false)
				 */
	
				return age >= 21 ? true : false;
			case "lottery" :
				return (age >= 18);
			case "unrestricted" :
				return age > 0 ? true : false;
			default :
				throw new IllegalArgumentException("Invalid product type.");
		}
	}
	
}
