package com.examples.threads;

public class LambdaThread {
	public static void main(String[] args) {
		System.out.println("This is the main method!");
		
		Runnable r = () -> {
			System.out.println("I'm a thread (lambdas)");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Lambda Thread Done!");
		};
		
		Thread thread = new Thread(r, "lamThread");
		
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of Main method");
	}
}
