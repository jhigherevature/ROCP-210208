package com.bankingapi.devaraj.Application;

import java.util.Scanner;

public class MainSimulator {
	
	public static void main(String[] args) {

		System.out.println("\nWelcome to ABC Bank Inc..!!!!!!!!!!!!!!!");
		Scanner scan = new Scanner(System.in);

		loop: while (true) {
			initialInstructions();
			if(scan.hasNextLine());
			String menu = scan.next();
			selection: switch (menu) {
			case "1": {
				
				break selection;
			}
			case "2": {
				//EmployeeApplication.employeeActivities();
				break selection;
			}
			case "3": {
				CustomerApplication.customerActivities();
				break selection;
			}
			default:
				System.out.println("Wrong Input!!!!!!! Try Again");
				break selection;
			case "q":
				System.out.println("Thank you for Using ABC Bank Inc. Portal");
				break loop;
			}
		}
		scan.close();
	}

	public static void initialInstructions() {
		System.out
				.println("\nPlease Enter 1 for ADMIN \nPlease Enter 2 for EMPLOYEE \nPlease Enter 3 for CUSTOMER/USER");
		System.out.println("Enter 'q' for Quit/Log Out");
		System.out.println("Enter Here: ");
	}
}
