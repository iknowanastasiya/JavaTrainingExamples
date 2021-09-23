package com.skillstorm;

/*
 * DESIGN PATTERN: SINGLETON
 * 	problem area: 
 * 		a large, resource intense class, that you really only need one of
 * 			class is going to be stateless: an app component vs holding data
 * 				meaning it only manipulates data, doesn't store it
 * 
 * 	solution:
 * 		make the class have:
 * 			1. a private constructor
 * 			2. static instance
 * 			3. getter method for the instance
 * 		Guarantees that only one instance is ever created
 */		


public class SingletonExample {

	public static void main(String[] args) {
		
		// each thread represents it being used in multiple places
		new Thread(	()->{
			Singleton singleton = Singleton.getInstance();
			System.out.println("First " + singleton);
		}).start();		// starting the thread
		new Thread(	()->{
			Singleton singleton = Singleton.getInstance();
			System.out.println("Second " + singleton);
		}).start();
		new Thread(	()->{
			Singleton singleton = Singleton.getInstance();
			System.out.println("Third " + singleton);
		}).start();
		new Thread(	()->{
			Singleton singleton = Singleton.getInstance();
			System.out.println("Fourth " + singleton);
		}).start();

		new Thread( () -> {
			EagerlyLoadedSingleton eSingleton = EagerlyLoadedSingleton.getInstance();
			System.out.println("Fifth " + eSingleton);
		}).start();
		new Thread( () -> {
			EagerlyLoadedSingleton eSingleton = EagerlyLoadedSingleton.getInstance();
			System.out.println("Sixth " + eSingleton);
		}).start();
		new Thread( () -> {
			EagerlyLoadedSingleton eSingleton = EagerlyLoadedSingleton.getInstance();
			System.out.println("Seventh " + eSingleton);
		}).start();
		
		
	}

}


// lazy loaded: it is only initialized, once it is needed
class Singleton {
	
	private static Singleton instance;
	private static Object lock = new Object();	// monitor: used to lock an object
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		
		// synchronized block: only allows one thread access at a time
			// must give it an object
		synchronized(lock) {
			
			// if we haven't created the instance already, create it
			if(instance == null) {
				instance = new Singleton();
			}
			return instance;
		}
	}
}

// eagerly loaded: it is loaded into memory at the start of the application
// mission critical: components only - the stuff your application wont work without
class EagerlyLoadedSingleton {
	
	private static EagerlyLoadedSingleton instance;
	private static Object lock = new Object();	// monitor: used to lock an object
	
	private EagerlyLoadedSingleton() {
		
	}
	
	// static block: this is the part that is eagerly loaded
		// executed first at class load time
	static {
		System.out.println("Inside singleton static block");
		instance = new EagerlyLoadedSingleton();
	}
	
	
	public static EagerlyLoadedSingleton getInstance() {
		return instance;
	}
	
}
