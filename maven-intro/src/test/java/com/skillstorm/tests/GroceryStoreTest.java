package com.skillstorm.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.skillstorm.GroceryStore;

public class GroceryStoreTest {

	
	@Test
	public void over21Test() {
		
		GroceryStore gs = new GroceryStore();
		
		int age = 21;
		assertTrue(gs.validateAge(age, "alcohol"));
		assertTrue(gs.validateAge(age, "lottery"));
		assertTrue(gs.validateAge(age, "unrestricted"));
		
		age = 25;
		assertTrue(gs.validateAge(age, "alcohol"));
		assertTrue(gs.validateAge(age, "lottery"));
		assertTrue(gs.validateAge(age, "unrestricted"));
	}
	
	
	@Test
	public void over18Test() {
		
		GroceryStore gs = new GroceryStore();
		int age1 = 18;
		int age2 = 17;
		int age3 = 19;
		
		// age = 18
		assertFalse(gs.validateAge(age1, "alcohol"));
		assertTrue(gs.validateAge(age1, "lottery"));
		assertTrue(gs.validateAge(age1, "unrestricted"));
		
		// age = 17
		assertFalse(gs.validateAge(age2, "alcohol"));
		assertFalse(gs.validateAge(age2, "lottery"));
		assertTrue(gs.validateAge(age2, "unrestricted"));
		
		// age = 19
		assertFalse(gs.validateAge(age3, "alcohol"));
		assertTrue(gs.validateAge(age3, "lottery"));
		assertTrue(gs.validateAge(age3, "unrestricted"));
		
	}
	
	@Test
	public void under17Test() {
		GroceryStore gs = new GroceryStore();
		int age1 = 17;
		int age2 = 16;
		int age3 = -1;
		
		// age = 17
		assertFalse(gs.validateAge(age1, "alcohol"));	
		assertFalse(gs.validateAge(age1, "lottery"));
		assertTrue(gs.validateAge(age1, "unrestricted"));
		
		// age = 16
		assertFalse(gs.validateAge(age2, "alcohol"));
		assertFalse(gs.validateAge(age2, "lottery"));
		assertTrue(gs.validateAge(age2, "unrestricted"));
		
		// age = -1
		assertFalse(gs.validateAge(age3, "alcohol"));
		assertFalse(gs.validateAge(age3, "lottery"));
		assertFalse(gs.validateAge(age3, "unrestricted"));
	}
	
	
	// when you WANT the code to return this exception
	@Test(expected = IllegalArgumentException.class)
	public void unknownItem() {
		GroceryStore gs = new GroceryStore();
		int age1 = 50;
		
		// this function call should return the expected exception
		gs.validateAge(age1, "unknown item");
		
	}
	
	
	
}
