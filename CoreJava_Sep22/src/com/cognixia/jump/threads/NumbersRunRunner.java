package com.cognixia.jump.threads;

// runner to test NumbersRun class
public class NumbersRunRunner {

	public static void main(String[] args) {

		// get the id for the main thread
		System.out.println("Main Thread ID: " + Thread.currentThread().getId());

		
		int size = 3;	//my code
		Thread[] threads = new Thread[size];	//my code
		
		
		// use a loop to create and start multiple threads
		for (int i = 0; i < 3; i++) {

			Runnable runObject = new NumbersRun();	//example //my code
			Thread t = new Thread(runObject);	//example	//my code
			
			threads[i] = new Thread(new NumbersRun());	//my code
			
			new Thread( new NumbersRun() ).start(); // must create a Thread and pass in the object that
		}											// implements Runnable to start the thread

	}

}
