package com.skillstorm.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitExample {

	// JUnit: a unit testing framework
	// testing independent components
	
	// Run As -> JUnit Test
	
	/*
	 * USE CASES
	 * 	project that connects to a database
	 * 	we want to test each of our database queries
	 * 
	 *	BeforeClass - establish connection to the database
	 *	Before - populate your database with sample data
	 *	Test - test results of a specific query
	 *	After - clear the database
	 *	AfterClass - close database connection 
	 * 
	 */
	
	
	@Test	// defines the following public void method as a JUint test
	public void test1() {
		
		// JUnit will run your tests, looking for any exception to be thrown
		// IF an exception gets thrown, your test fails
		// if JUnit fails a test, Maven WILL fail your build
		
		System.out.println("Test1");
		
	}
	
	// can have multiple tests, no guarantee what order they will run in
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	
	
	
	@Before	// the following public void method will run before EACH test
	public void setup() {
		
		// used to setup anything that is used in every single test
		
		System.out.println("-------------");
		System.out.println("Before Method");
	}
	
	
	@After // the following public void method will run after EACH test
	public void teardown() {
		
		// used to teardown anything you set up in a before method
		// will always run, even if an exception occurs in a before or test method
		
		System.out.println("After Method");
		System.out.println("-------------");
	}
	
	
	@BeforeClass // the following public static void method, will run ONCE, before everything else
	public static void setupOnlyOnce() {
		System.out.println("Before Class Method");
	}
	
	@AfterClass // the following public static void method, will run ONCE, after everything else
	public static void teardownOnlyOnce() {
		
		// used to teardown anything setup in your BeforeClass method
		// will always run, even if an exception is thrown anywhere 
		
		System.out.println("After Class Method");
	}
	
}
