package com.examples.methods;

public class Invocation {
	public static void main(String[] args) {
		
		takeDouble(40);
		
		double response = getNumber(2);
		takeDouble(response);
		
		System.out.println(takeDouble(getNumber(2)));
	}
	
	public static double getNumber(int choice) {
		if (choice == 1) {
			return 15;
		} else if (choice == 2) {
			return 40;
		} else {
			return 100;
		}
	}
	
	public static boolean takeDouble(double value) {
		if (value > 50) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void performBothMethods() {
		takeDouble(getNumber(2));
	}
}
