package com.examples.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("I am a thread!");

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				/*
				 * The InterruptedException is thrown when the Thread's interrupt() method is
				 * called. This can occur if another thread tries to halt its operations.
				 */
				e.printStackTrace();
				break;
			}
		}

		/*
		 * currentThread() is a static method on the thread class that references
		 * whichever thread is currently executing in java.
		 */
		System.out.println(Thread.currentThread().getName() + " is ending!");
	}

}
