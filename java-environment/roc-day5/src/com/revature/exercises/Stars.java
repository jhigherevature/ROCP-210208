package com.revature.exercises;

public class Stars {
	public static void main(String[] args) {
		System.out.println("Print with Concat:");
		printWithConcat();
		
		System.out.println("Print with Print method:");
		printUsingPrint();
	}
	
	public static void printWithConcat() {
		for (int i = 1; i <= 5; i++) {
			String stars = "";
			for (int j = 1; j <= i; j++) {
				stars = stars + "*";
//				System.out.println(stars);
			}
			System.out.println(stars);
		}
	}
	
	public static void printUsingPrint() {
		String stars = "*";
		for(int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(stars);
			}
			System.out.println();
		}
	}
}
