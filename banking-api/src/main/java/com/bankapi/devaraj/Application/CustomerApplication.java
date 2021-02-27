package com.bankapi.devaraj.Application;

import java.util.Scanner;

import com.bankapi.devaraj.model.Customer;
import com.bankapi.devaraj.model.CustomerAccountType;
import com.bankapi.devaraj.model.LoginDetail;
import com.bankapi.devaraj.service.CustomerService;

public class CustomerApplication {

	public static void main(String[] args) {

		CustomerService customerService = new CustomerService();
		System.out.println("Welcome to Customer Portal of ABC Bank Inc..!!!!!!!!!!!!!!!");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		loop: while (true) {
			initialInstructions();
			String menu = scan.next();
			selection: switch (menu) {
			case "1": {
				System.out.println("Enter User Name: ");
				String userName = scan.next();
				System.out.println("Enter User Password: ");
				String userPassword = scan.next();
				int userId = customerService.getUserId("Customer");
				customerService.createCustomerLogin(new LoginDetail(userName, userPassword, userId));
				break selection;
			}
			case "2": {
				System.out.println("Enter User Name: ");
				String userName = scan.next();
				System.out.println("Enter User Password: ");
				String userPassword = scan.next();

				boolean loginStatus = customerService.customerLogin(userName, userPassword);
				int loginId = customerService.getLoginId(userName, userPassword);

				if (loginStatus == true) {
					// Show account Status here
					custSelectionloop: while (true) {
						customerInstruction();
						String customerSelection = scan.next();

						custSelection: switch (customerSelection) {
						case "1": {
							System.out.println("Enter First Name: ");
							String f_name = scan.next();
							System.out.println("Enter Last Name: ");
							String l_name = scan.next();
							System.out.println("Enter Phone Number: ");
							String phone = scan.next();
							System.out.println("Enter Social Security Number: ");
							int ssn = scan.nextInt();
							System.out.println("Enter Email: ");
							String email = scan.next();
							System.out.println("Enter Street Address: ");
							String street_address = scan.next();
							System.out.println("Enter City: ");
							String city = scan.next();
							System.out.println("Enter State: ");
							String state = scan.next();
							System.out.println("Enter Zip Code: ");
							int zipCode = scan.nextInt();
							System.out.println("Enter Country: ");
							String country = scan.next();
							customerService.createCustomerAccount(new Customer(f_name, l_name, phone, ssn, email,
									street_address, city, state, zipCode, country, loginId));
							System.out.println("\nPlease Select Account Type: ");
							System.out.println(
									"Enter 1 for Checking Account, Enter 2 for Saving Account, Enter 3 for IRA\nEnter Here: ");
							int account_type = scan.nextInt();
							int customer_id = customerService.getCustomerId(email, ssn);
							customerService
									.insertCustomerAccountType(new CustomerAccountType(customer_id, account_type));
							break custSelection;
						}
						case "2": {
							
							
						}
						case "3":{
							
							
						}
						case "4" :{
							
							
						}

						default:
							System.out.println("Try Again");
							break custSelection;
						case "q":
							System.out.println("Thank you for Using");
							break custSelectionloop;

						}
					}
				} else if (loginStatus == false) {
					System.out.println("User Name OR Password is incorrect. Please try again");
				}
				break selection;
			}
			default:
				System.out.println("Try Again");
				break selection;
			case "q":
				System.out.println("Thank you for Using");
				break loop;
			}
		}
		scan.close();
	}

	public static void initialInstructions() {
		System.out.println("\nPlease Enter 1 to Create new Login OR Enter 2 for Login..");
		System.out.println("Enter 'q' for Quit/Log Out");
		System.out.println("Enter Here: ");
	}

	public static void customerInstruction() {
		System.out.println("\nPlease Enter 1 to create new account");
		System.out.println("Enter 2 for Deposit");
		System.out.println("Enter 3 for Withdraw");
		System.out.println("Enter 4 for Transfer the fund");
		System.out.println("Enter q for Quit/Log Out");
		System.out.println("Enter Here: ");
	}
}
