package com.bankingapi.devaraj.Application;

import java.util.HashMap;
import java.util.Scanner;

import com.bankingapi.devaraj.model.Customer;
import com.bankingapi.devaraj.model.CustomerAccountDetails;
import com.bankingapi.devaraj.model.CustomerAccountType;
import com.bankingapi.devaraj.model.LoginDetail;
import com.bankingapi.devaraj.service.CommonService;
import com.bankingapi.devaraj.service.CustomerService;

public class CustomerApplication {

	public static void customerActivities() {
		
		CommonService commonService = new CommonService();
		CustomerService customerService = new CustomerService();
		System.out.println("Welcome to Customer Portal of ABC Bank Inc..!!!!!!!!!!!!!!!");
		String user ="Customer";
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
				int userId = commonService.getUserId(user);
				commonService.createLogin(new LoginDetail(userName, userPassword, userId));
				break selection;
			}
			case "2": {
				System.out.println("Enter User Name: ");
				String userName = scan.next();
				System.out.println("Enter User Password: ");
				String userPassword = scan.next();

				boolean loginStatus = commonService.userLogin(userName, userPassword, user);
				int loginId = commonService.getLoginId(userName, userPassword);

				if (loginStatus == true) {
					HashMap<String, CustomerAccountDetails> accountMap = customerService.getAccountDetail(userName,
							userPassword);
					for (CustomerAccountDetails value : accountMap.values()) {
						System.out.println("\nAccount Details:=======================================================");
						System.out.println("Account Number:" + value.getCustomer_account_Numer() + "\t\t\t\t"
								+ "Account Type: " + value.getCustomer_account_Type());
						System.out.println("Customer Name: " + value.getCustomer_name() + "\t\t\t" + "Account Balance: "
								+ value.getCustomer_balance());
						System.out.println("=======================================================================");
					}
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
							System.out.println("\nPlease Enter the account Number for Deposit: ");
							int accountNumber = scan.nextInt();
							CustomerAccountDetails csDetails = customerService.getCustomerAccountInfo(userName,
									userPassword, accountNumber);
							System.out.println("\nAccount Detail:====================================================");
							System.out.println("Account Number: " + csDetails.getCustomer_account_Numer()
									+ "\t\t\tAccount Name: " + csDetails.getCustomer_name());
							System.out.println("Account Type: " + csDetails.getCustomer_account_Type()
									+ "\t\t\tCurrent Balance: " + csDetails.getCustomer_balance());
							System.out.println("=====================================================================");
							System.out.println("Enter the Amount: ");
							double amount = scan.nextDouble();
							if (amount > 0) {
								customerService.depositToAccount(userName, userPassword, accountNumber, amount);
								CustomerAccountDetails csDetail = customerService.getCustomerAccountInfo(userName,
										userPassword, accountNumber);
								System.out.println(
										"\nAccount Detail:====================================================");
								System.out.println("Account Number: " + csDetail.getCustomer_account_Numer()
										+ "\t\t\tAccount Name: " + csDetail.getCustomer_name());
								System.out.println("Account Type: " + csDetail.getCustomer_account_Type()
										+ "\t\t\tNew Balance: " + csDetail.getCustomer_balance());
								System.out
										.println("==================================================================");
							} else {
								System.out.println("Amount can not be less than 0.00");
							}
							break custSelection;
						}
						case "3": {
							System.out.println("\nPlease Enter the account Number to Withdraw: ");
							int accountNumber = scan.nextInt();
							CustomerAccountDetails csDetails = customerService.getCustomerAccountInfo(userName,
									userPassword, accountNumber);
							System.out.println("\nAccount Detail:====================================================");
							System.out.println("Account Number: " + csDetails.getCustomer_account_Numer()
									+ "\t\t\tAccount Name: " + csDetails.getCustomer_name());
							System.out.println("Account Type: " + csDetails.getCustomer_account_Type()
									+ "\t\t\tCurrent Balance: " + csDetails.getCustomer_balance());
							System.out.println("=====================================================================");
							System.out.println("Enter the Amount: ");
							double amount = scan.nextDouble();
							if (amount > 0) {
								customerService.withDrawFromAccount(userName, userPassword, accountNumber, amount);
								CustomerAccountDetails csDetail = customerService.getCustomerAccountInfo(userName,
										userPassword, accountNumber);
								System.out.println("Account Detail:=================================================");
								System.out.println("Account Number: " + csDetail.getCustomer_account_Numer()
										+ "\t\t\tAccount Name: " + csDetail.getCustomer_name());
								System.out.println("Account Type: " + csDetail.getCustomer_account_Type()
										+ "\t\t\tNew Balance: " + csDetail.getCustomer_balance());
								System.out.println("=================================================================");
							} else {
								System.out.println("Amount can not be less than 0.00");
							}
							break custSelection;
						}
						case "4": {
							System.out.println("Enter Source Account Number to Trnasfer: ");
							int sourceAccount = scan.nextInt();
							System.out.println("Enter Target Account number to Transfer: ");
							int targetAccount = scan.nextInt();
							System.out.println("Enter Amount to Transfer: ");
							double ammoutToTransfer = scan.nextDouble();
							customerService.transferFund(userName, userPassword, sourceAccount, targetAccount,
									ammoutToTransfer);
							CustomerAccountDetails csDetail = customerService.getCustomerAccountInfo(userName,
									userPassword, sourceAccount);
							System.out.println("Account Detail:=================================================");
							System.out.println("Account Number: " + csDetail.getCustomer_account_Numer()
									+ "\t\t\tAccount Name: " + csDetail.getCustomer_name());
							System.out.println("Account Type: " + csDetail.getCustomer_account_Type()
									+ "\t\t\tNew Balance: " + csDetail.getCustomer_balance());
							System.out.println("=================================================================");
							break custSelection;
						}

						default:
							System.out.println("Wrong Input!!!!!!! Try Again");
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
				System.out.println("Wrong Input!!!!!!! Try Again");
				break selection;
			case "q":
				System.out.println("Thank you for Using Customer Portal");
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

	public static void customerInstruction() {
		System.out.println("\nPlease Enter 1 to create new account");
		System.out.println("Enter 2 for Deposit");
		System.out.println("Enter 3 for Withdraw");
		System.out.println("Enter 4 for Transfer the fund");
		System.out.println("Enter q for Quit/Log Out");
		System.out.println("Enter Here: ");
	}
}
