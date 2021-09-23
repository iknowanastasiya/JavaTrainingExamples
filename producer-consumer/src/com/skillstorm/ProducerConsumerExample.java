package com.skillstorm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
	// java.util.concurrent: collections designed to avoid concurrency issues in threads

/*
 * DESIGN PATTERN: PRODUCER-CONSUMER
 * 	problem area: needing to read in and process a TON of data
 * 
 * 	o-----> o-----> o------> etc.
 * 
 * 	solution:
 * 	create two threads to run at the same time
 * 		one to be the producer: read in data, put it into a queue
 * 		one to be the consumer: process the data in the queue
 */


public class ProducerConsumerExample {

	// creates a concurrent queue with size 10
	private static ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<>(10);	
	
	public static void main(String[] args) {
		
		
		/*
		 * producer moves faster than the consumer?	queue overflows
		 * consumer moves faster than the producer?	pop returns null
		 */
		
		
		// producer is going to fill up the queue
		Thread producer = new Thread( () -> {
			
			// simulate some I/O process
//			while(true) {
//				try {
//					// adding a random number to the queue
//					buffer.put(new Random().nextInt());	
//					System.out.println("Elements in queue: " + buffer.size());
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
			
			try(FileInputStream fileIn = new FileInputStream("src/input.txt")) {
				
				int inByte;
				while((inByte = fileIn.read()) != -1) {		// -1 means the end of file (eof)
					buffer.put(inByte);
				}
			}
			catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		
		// consumer pops from the queue to process some data
		Thread consumer = new Thread ( () -> {
//			while(true) {
//				try {
//					System.out.println(buffer.take());	// pops the head off of the queue (like .poll())
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
			
			try(FileOutputStream fileOut = new FileOutputStream("src/output.txt")) {
				
				do {
					fileOut.write(buffer.take());
				}while(!buffer.isEmpty());	// loop until buffer is empty
			}
			catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		});

		
		
		producer.start();
		consumer.start();
		
		
	}

}
