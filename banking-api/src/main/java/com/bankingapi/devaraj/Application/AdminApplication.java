package com.bankingapi.devaraj.Application;

import java.util.HashMap;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bankingapi.devaraj.dao.AdminDAO;
import com.bankingapi.devaraj.model.Customer;
import com.bankingapi.devaraj.model.CustomerAccountDetails;
import com.bankingapi.devaraj.model.Employee;
import com.bankingapi.devaraj.model.LoginDetail;
import com.bankingapi.devaraj.service.AdminService;
import com.bankingapi.devaraj.service.CommonService;
import com.bankingapi.devaraj.service.EmployeeService;

public class AdminApplication {

	public static Logger log = LogManager.getLogger(AdminDAO.class);

	public static void main(String[] args) {

		CommonService commonService = new CommonService();
		AdminService adminService = new AdminService();
		EmployeeService empService = new EmployeeService();
		System.out.println("Welcome to Admin Portal of ABC Bank Inc..!!!!!!!!!!!!!!!");
		String user = "Admin";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		loop: while (true) {
			initialInstructions();
			String menu = scan.next();
			selection: switch (menu) {
			case "1": {
				try {
					System.out.println("Enter User Name: ");
					String userName = scan.next();
					System.out.println("Enter User Password: ");
					String userPassword = scan.next();
					int userId = commonService.getUserId("Admin");
					commonService.createLogin(new LoginDetail(userName, userPassword, userId));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break selection;
			}
			case "2": {
				try {
					System.out.println("Enter User Name: ");
					String userName = scan.next();
					System.out.println("Enter User Password: ");
					String userPassword = scan.next();
					boolean loginStatus = commonService.userLogin(userName, userPassword, user);
					if (loginStatus == true) {
						log.info(" Admin Login Success !!!!!!!!!!!");
						Employee emp = empService.getEmployeeDetails(userName, userPassword);
						System.out.println("\nAdmin Login As: ==================================================");
						System.out.println("Employee Id: " + emp.getEmployee_id() + "\t\t\t\tEmployee Name: "
								+ emp.getEmployee_fname() + " " + emp.getEmployee_lname());
						System.out.println("Employee Role: " + user + "\t\t\tEmployee Login: "
								+ emp.getEmployee_login().getLogin_user_name());
						System.out.println("========================================================================");

						adminloop: while (true) {
							adminInstruction();
							String adminSelection = scan.next();
							adminselection: switch (adminSelection) {
							case "1": {
								log.info("pending account approval started");
								HashMap<Integer, Customer> cust = empService.listPendingApprovals();
								if (!cust.isEmpty()) {
									System.out.println("\nList of customers for pending approvals: ");
									for (Customer cs : cust.values()) {
										System.out.println(cs);
									}
									System.out.println("Enter Customer ID to vieew customer details: ");
									int customer_id = scan.nextInt();
									Customer customer = cust.get(customer_id);
									String customerEmail = customer.getCustomer_email();
									int customerssn = customer.getCustomer_ssn();
									System.out.println("=================================================");
									System.out.println(customer);
									System.out.println("=================================================");
									System.out.println("Enter 1 to Approve Account OR Enter 2 to deny/reject: ");
									int emp_input = scan.nextInt();
									if (emp_input == 1) {
										empService.approveAccount(customer_id, customerEmail, customerssn);
									} else if (emp_input == 2) {
										empService.denyApprovals(customer_id);
									}
								} else {
									System.out.println("There are no pending accounts for approval");
								}
								break adminselection;
							}
							case "2": {
								log.info("Withdraw service started");
								System.out.println("Enter Account number for Witdraw Service :");
								int accountNumber = scan.nextInt();
								CustomerAccountDetails cusDetail = adminService.getCustomerDetail(accountNumber);
								System.out.println("Account Detail:===========================================");
								System.out.println("Account Number: " + cusDetail.getCustomer_account_Numer()
										+ "\t\tAccount Name: " + cusDetail.getCustomer_name() + "\t\tCurrent Balance: "
										+ cusDetail.getCustomer_balance());
								System.out.println("============================================================");
								System.out.println("Enter amount: ");
								double amount = scan.nextDouble();
								if (amount >= 0) {
									adminService.withdrawFromAccount(accountNumber, amount);
									CustomerAccountDetails customerDetail = adminService
											.getCustomerDetail(accountNumber);
									System.out.println("Updated Detail:============================================");
									System.out.println("Account Number: " + customerDetail.getCustomer_account_Numer()
											+ "\t\tAccount Name: " + customerDetail.getCustomer_name()
											+ "\t\tUpdated Balance: " + customerDetail.getCustomer_balance());
									System.out.println("===========================================================");
								} else {
									System.out.println("Amount can not be less than 0.00");
								}
								break adminselection;
							}
							case "3": {
								log.info("Deposit service started");
								System.out.println("Enter Account number for Deposit Service :");
								int accountNumber = scan.nextInt();
								CustomerAccountDetails cusDetail = adminService.getCustomerDetail(accountNumber);
								System.out.println("Account Detail:===========================================");
								System.out.println("Account Number: " + cusDetail.getCustomer_account_Numer()
										+ "\t\tAccount Name: " + cusDetail.getCustomer_name() + "\t\tCurrent Balance: "
										+ cusDetail.getCustomer_balance());
								System.out.println("============================================================");
								System.out.println("Enter amount: ");
								double amount = scan.nextDouble();
								if (amount >= 0) {
									adminService.depositToAccount(accountNumber, amount);
									CustomerAccountDetails customerDetail = adminService
											.getCustomerDetail(accountNumber);
									System.out.println("Updated Detail:============================================");
									System.out.println("Account Number: " + customerDetail.getCustomer_account_Numer()
											+ "\t\tAccount Name: " + customerDetail.getCustomer_name()
											+ "\t\tUpdated Balance: " + customerDetail.getCustomer_balance());
									System.out.println("===========================================================");
								} else {
									System.out.println("Amount can not be less than 0.00");
								}
								break adminselection;
							}
							case "4": {
								log.info("Fund Transfer service started");
								System.out.println("Enter source Account Number: ");
								int sourceAcountNumber = scan.nextInt();
								System.out.println("Enter target Account Number: ");
								int targetAccountNumber = scan.nextInt();
								System.out.println("Enter Amount to Transfer");
								double amountToTransfer =scan.nextDouble();
								if(amountToTransfer>0) {
									adminService.transferFundService(sourceAcountNumber, targetAccountNumber, amountToTransfer);
								}else {
									System.out.println("Amount can not be less than 0.00");
								}
								break adminselection;
							}
							default:
								System.out.println("Wrong Input!!!!!!! Try Again");
								break adminselection;
							case "q":
								System.out.println("Thank you for Using");
								break adminloop;
							}
						}

					} else {
						System.out.println("User Id or Password is incorrect. Please Try Again!!!!!!!!!!!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
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
		scan.close();
	}

	public static void initialInstructions() {
		System.out.println("\nPlease Enter 1 to Create new Login OR Enter 2 for Login..");
		System.out.println("Enter 'q' for Quit/Log Out");
		System.out.println("Enter Here: ");
	}

	public static void adminInstruction() {
		System.out.println("Enter 1 to Approve account \nEnter 2 for Withdraw Function \nEnter 3 for Deposit Function "
				+ "\nEnter 4 for Transfer Function \nOR q for Logout/Quit");
		System.out.println("Enter Here: ");

	}
}
