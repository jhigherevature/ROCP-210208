package com.revature.joseph.main;

import java.util.Scanner;

import com.revature.joseph.model.Employee;

public class SimulatorExample {
	
	public static Employee loggedInUser;
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Ask if employee/admin
		
		while () {
			System.out.println("Are you an employee?");
			String input = scan.nextLine();
			if (input.toLowerCase() == "y" || input.toLowerCase() == "yes") {
				// employee
				doEmployeeStuff();
			} else if(input.toLowerCase() == "n" || input.toLowerCase() == "no") {
				// customer
				doCustomerStuff();
			} else {
				System.out.println("I didn't recognize that");
			}
		}
	}
	
	public static void doEmployeeStuff() {
		// log the employee in.
		// authenticate to make sure that the employee does exist
		// if so, continue with employee operations
		// if not, then kick them back out to the main menu/simulator
	}
	
	public static void doCustomerStuff() {
		// if they need a new account, direct them to that, or do those steps
	}
}
