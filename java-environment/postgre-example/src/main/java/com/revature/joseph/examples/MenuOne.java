package com.revature.joseph.examples;

import java.util.Scanner;

public class MenuOne {
	public static Scanner scan = new Scanner(System.in);
	
	public static int menuOne() {
		while (true) {
			System.out.println("THIS IS MENU ONE, DO YOU WANT TO EXIT?");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("Go to Menu Two!");
				return 2;
			} else if (choice == 2) {
				System.out.println("Go to Menu Three!");
				return 3;
			}
		}
	}
}
