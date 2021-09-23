package com.skillstorm;


// process: stand-alone 
// thread: lightweight sub-process, dependent upon the main process


/*
 * a single process:
 * 1 ----------
 * 2            ----------
 * 3                       -----------------
 * 4                                         ----------------
 * 

 * multiple threads: 
 * 1 ------------
 * 2   -----------
 * 3  ------------
 * 4	    -------------
 */


/*
 * concurrency issues
 * 	multiple threads are trying to access the same data
 * 
 * 	lost update: when two threads are trying to access or change the same piece of data
 * 		but only one change actually happens
 * 
 * 
 * 	deadlock: when one process has to wait for for another process to finish
 * 		process1 has someone resource that process2 needs
 * 		process2 has some resource that process1 needs 
 * 			neither process can finish
 */

/*
 * 
 * every thread has its own stack in memory
 * 
 * 	'volatile' keyword - the method or variable will be put on the heap
 */


/*
 * THREAD STATES
 * 	new : thread was created
 * 	runnable : thread is either currently running or it is ready to run
 * 	waiting : you tell a thread to wait on some condition; any locks are released
 * 	timed waiting : you tell the thread to wait for an amount of time; locks are not released
 * 	terminated : the thread is finished, or the program crashed
 * 	blocked : it tried to access some resource, but has to wait
 * 
 */

public class ThreadsExample {	// dont inherit from Thread unless you want to make your own Thread

	
	public static int counter = 0;
	
	public static void main(String[] args) {
		
		
		// Runnable is a functional interface
			// it only has one abstract method inside of it, the run() method
		// anonymous inner class
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// define what you want the thread (thread1) to do while it is running 
				
				int localCount = 0;
				
				// loop 50 times, so counter should be 50
				for(int i = 0; i < 50; i++) {
					//localCount++;
					localCount = incrementor(localCount);
					counter++;
				}
				
				try {
					Thread.sleep(5000);		// enters timed waiting for about 5 seconds
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Thread1: " + counter);
				System.out.println("Thread1 Local: " + localCount);
			}
			
		});
		
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// define what you want the thread (thread1) to do while it is running 
				
				// starts at 5, loops 50 times, so counter should be 55
				counter = 5;
				int localCount = 5;
				for(int i = 0; i < 50; i++) {
					//localCount++;
					localCount = incrementor(localCount);
					counter++;
				}
				System.out.println("Thread2: " + counter);
				System.out.println("Thread2 Local: " + localCount);
			}
			
		});
		
		// lambda expression
			// works because runnable only has a run method
		Thread thread3 = new Thread( () -> {

			// class body
			
			// starts at 20, loops 50 times, should be 70
			counter = 20;
			int localCount = 20;
			for(int i = 0; i < 50; i++) {
				//localCount++;
				counter++;
				localCount = incrementor(localCount);
			}
			System.out.println("Thread3: " + counter);
			System.out.println("Thread3 Local: " + localCount);
			
			
		});
		
//		thread1.start();	// puts thread into its running state
//		thread2.start();
//		thread3.start();
		
		
		/*
		 * JOINING THREADS
		 * 	tell the current process to wait for a thread to finish
		 */
		
		thread1.start();
		try {
			thread1.join();		// tells current process to wait for thread1
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread2.start();
		try {
			thread2.join();		// tells current process to wait for thread2
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread3.start();
		try {
			thread3.join();		// tells current process to wait for thread3
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		/*
		 * OTHER THREAD METHODS
		 * 
		 *  sleep(): enters timed waiting
		 * 	wait(): enters waiting state
		 * 	notify(): returns a single waiting thread to runnable
		 * 	notifyAll(): returns all waiting threads to runnable
		 * 	interrupt(): tell one thread to stop what its doing, and to do something else
		 */
		
	}
	
	/*
	 * SYNCHRONIZED METHOD
	 * 	a method that will only allow one thread to access it at a time
	 */
	public static synchronized int incrementor(int num) {
		
		// num++ : access num and then increment it
		// ++num : increments first and then accesses it
		return ++num;
	}
	
}
