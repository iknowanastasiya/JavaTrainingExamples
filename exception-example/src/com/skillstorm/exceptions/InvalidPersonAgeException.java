package com.skillstorm.exceptions;
// put exceptions in their own package

// end the name with 'Exception'
// make sure to inherit from some existing Exception class
public class InvalidPersonAgeException extends Exception {

	public InvalidPersonAgeException() {
		super();
	}
	
	// always include a constructor that takes in a string
	public InvalidPersonAgeException(String message) {
		super(message);
	}
	
}
