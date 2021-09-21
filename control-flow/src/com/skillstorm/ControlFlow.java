package com.skillstorm;

public class ControlFlow {

	public static void main(String[] args) {
		
		//branching("BCD", 24);
		loops();
	}
	
	
	/*
	 * branching is used for when you want to execute some block of code
	 * based on some condition or predefined value
	 */
	public static void branching(String choice, int value) {
		
		/*
		 *  IF-ELSE STATEMENTS
		 *  && - and; both sides must be true
		 *  || - or; only one has to be true
		 *  only checks one side if it can
		 *  
		 *  bitwise unary operators
		 *  & - and;
		 *  	true & true = true
		 *  	true & false = false
		 *  	false & true = false
		 *  	false & false = false
		 *  	
		 *  | - or;
		 *  	true | true = true
		 *  	true | false = true
		 *  	false | true = true
		 *  	false | false = false
		 *  
		 */
		
		if((value > 100) || (value < 0)) {	// evaluates some boolean condition
			//System.out.println("value is greater than 100 or less than 0");
		}
		else if(value > 50){
			//System.out.println("value is greater than 50 but less than or equal 100");
		}
		else {
			//System.out.println("value is less than or equal 50 and greater than 0");
		}
		
		/*
		 * SWITCH STATEMENTS
		 * it will evaluate the value of some variable, and decide which branch to go down
		 * fall-thru: if the case does not break, following code will still execute
		 */
		
		switch(choice) {
			case "ABC": {
				System.out.println("choice is ABC");
				break;	// exits switch statement, prevents fall thru
			}
			case "BCD": {
				System.out.println("choice is BCD");
				break;	// break can be replaced with return to exit the function function
			}
			case "CDE": {
				System.out.println("choice is CDE");
				break;
			}
			default: {
				System.out.println("choice isn't selected");
				break;
			}
		}
		
		
		
	}

	
	/*
	 * loops are used to execute the same code over again, until some condition is met
	 */
	public static void loops() {
		
		/*
		 * WHILE LOOP
		 * 	best when you don't know how many times to loop, but want to check the value of some condition
		 */
		int i = 0;
		boolean status = false;
		
		// not good use - use for loop instead
		while(i < 10) {	// checks some boolean condition and then runs the code
			
			//System.out.println("inside while loop");
			
			
			// i++, access i, then increments it
			// ++i, increments i, then accesses it
			// decrement operator: --, subtracts 1, same rules as ++ 
			// ++: increment operator in java adds 1
			i++;	
		}
		
		// good use
		while(status) { 	// with booleans, don't need == true
			
			System.out.println("inside while loop");
			
			double randomNumber = Math.random();	// gives a random value, by default: between 0 and 1
			if(randomNumber < 0.5) {
				status = false; 	// end loop
			}
			
		}
		
		
		/*
		 * DO-WHILE LOOP
		 * 	same as while loop, but will ALWAYS run at least once
		 */
		do {
			System.out.println("inside do-while loop");
			
			double randomNumber = Math.random();	// gives a random value, by default: between 0 and 1
			if(randomNumber < 0.5) {
				status = false; 	// end loop
			}
			else {
				status = true;		// keep looping
			}
		} while(status);	// boolean condition being checked
		
		
		
		/*
		 * FOR LOOP
		 *  syntax: for( some counter; boolean condition; change in counter) {}
		 *  best when you know how many times to loop
		 */
		
		for(int j = 0; j < 10; j = j + 5) {
			//System.out.println("inside for loop");
		}
		
		
		/*
		 * FOR EACH LOOP
		 * 	syntax: for(some counter : array) {}
		 */
		int[] arr = {5, 67, 3, 8, 99};
		
		for (int temp : arr) {	// reads like: for each int in array
			System.out.println(temp);
		}
		
	}
}
