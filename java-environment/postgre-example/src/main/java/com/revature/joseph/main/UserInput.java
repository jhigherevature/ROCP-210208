package com.revature.joseph.main;

import java.util.Scanner;

public class UserInput {
	
	public static String getUserStringInput(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextLine();
	}
	
	public static double getNumericalInput(String message) {
		Scanner scan = new Scanner(System.in);
		System.out.println(message);
		return scan.nextDouble();
	}
}
