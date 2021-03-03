package com.revature.joseph.examples;

import java.util.Scanner;

public class WhileLoop {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("Do you want to exit?");
			String input = scan.nextLine();
			if (input.intern().toLowerCase() == "y" || input.intern().toLowerCase() == "yes") {
				System.out.println("Alright then, goodbye!");
				break;
			} else {
				System.out.println("Great, you don't want to leave!");
			}
		}
	}
}
