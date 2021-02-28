package com.bankingapi.devaraj.Application;

import java.util.Scanner;

import com.bankingapi.devaraj.model.LoginDetail;
import com.bankingapi.devaraj.service.CommonService;

public class EmployeeApplication {

	public static void employeeActivities() {

		CommonService commonService = new CommonService();
		System.out.println("Welcome to Employee Portal of ABC Bank Inc..!!!!!!!!!!!!!!!");
		String user = "Employee";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		loop: while (true) {
			initialInstructions();
			String menu = scan.next();
			selection: switch (menu) {
			case "1":{
				System.out.println("Enter User Name: ");
				String userName = scan.next();
				System.out.println("Enter User Password: ");
				String userPassword = scan.next();
				int userId = commonService.getUserId(user);
				commonService.createLogin(new LoginDetail(userName, userPassword, userId));
				break selection;
			}
			case "2":{
				System.out.println("Enter User Name: ");
				String userName = scan.next();
				System.out.println("Enter User Password: ");
				String userPassword = scan.next();

				boolean loginStatus = commonService.userLogin(userName, userPassword, user);
				System.out.println(loginStatus);
				break selection;
			}

			default:
				System.out.println("Wrong Input!!!!!!! Try Again");
				break selection;
			case "q":
				System.out.println("Thank you for Using");
				break loop;
			}
		}
		//scan.close();
	}

	public static void initialInstructions() {
		System.out.println("\nPlease Enter 1 to Create new Login OR Enter 2 for Login..");
		System.out.println("Enter 'q' for Quit/Log Out");
		System.out.println("Enter Here: ");
	}
}
