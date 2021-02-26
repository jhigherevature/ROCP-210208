package com.examples.threads;

public class DeadSimulator {
	
	public static void main(String[] args) {
		Dead d = new Dead();
		
		for (int i = 0; i < 10; i++) {
			Runnable r1 = () -> {
				d.func1();
			};
			Thread t1 = new Thread(r1, "Run 1");
			
			Runnable r2 = () -> {
				d.func2();
			};
			Thread t2 = new Thread(r2, "Run 2");
			t1.start();
			t2.start();
		}
	}	
}
