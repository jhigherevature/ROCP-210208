package com.revature.joseph.examples;

import java.util.Scanner;

public class MenuTwo {
	public static Scanner scan = new Scanner(System.in);
	
	public static void menuTwo() {
		while (true) {
			System.out.println("THIS IS MENU TWO, DO YOU WANT TO EXIT?");
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
