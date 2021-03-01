package com.examples.threads;

public class ThreadSimulator {
	public static void main(String[] args) {
		System.out.println("\t\t\tThis is the start of our main thread!");
		// The overloaded Thread constructor can take a thread subclass and a name to name 
		// the newly created thread
		Thread mThread = new Thread(new MyThread(), "MyThread");
//		Thread mThread = new MyThread();
		
		Thread runThread = new Thread(new RunnableThread(), "RunThread");
//		Thread runThread = new RunnableThread();
		
		// Thread priority ranges from 1 to 10 (1 being lowest, 10 highest)
		// The DEFAULT priority for threads is set to 5
		mThread.setPriority(3);
		mThread.start();
		runThread.start();
		runThread.setPriority(4);
		
		/*
		 * You invoke the join method on the thread you wish to wait on, INSIDE
		 * the thread you want to wait...In this case, I want the main method
		 * to wait on the runThread...I call join on the runThread INSIDE the main
		 * method
		 */
		try {
			runThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\t\t\tThis is the END of our main thread");
	}
}
