package com.examples.threads;

public class RunnableThread implements Runnable {

	public void run() {
		System.out.println("I am a thread using runnable");

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				// If this thread is interruped, I want the for-loop to stop...
				break;
			}
		}

		System.out.println(Thread.currentThread().getName() + " is ending!");
	}

}
