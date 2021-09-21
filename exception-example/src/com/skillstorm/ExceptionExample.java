package com.skillstorm;

import com.skillstorm.beans.Person;
import com.skillstorm.exceptions.InvalidPersonAgeException;

public class ExceptionExample {

	public static void main(String[] args) {
		
		// unchecked exception: runtime errors ex: IllegalArgumentException, NullPointerExceptions etc.
		// checked exception:	compiler will notice ex: missing semi-colon, syntax errors, etc.
		
		Person person = new Person();
		
		try {	// to attempt some "risky code"
			person.setAge(0);
			
			// code will stop as soon as it hits an exception
			//System.out.println("Age was valid!!");
		}
		
		// multi-catch: any number of catch blocks for a single try block
		// order catch blocks from least general to most general
		catch (InvalidPersonAgeException e) {
			//System.out.println("age is zero");
			e.printStackTrace();
		}
		catch (IllegalArgumentException e) {	// execute some code, if an exception is caught
			//System.out.println("age was negative");
			e.printStackTrace();
		}
		finally {	// will ALWAYS run, no matter what
			//System.out.println("inside finally block");
		}
		
		
		System.out.println("age: " + person.getAge());

	}

}
