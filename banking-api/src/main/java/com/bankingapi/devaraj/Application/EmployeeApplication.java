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
import com.bankingapi.devaraj.service.CommonService;
import com.bankingapi.devaraj.service.EmployeeService;

public class EmployeeApplication {

	public static Logger log = LogManager.getLogger(AdminDAO.class);

	public static void main(String[] args) {

		CommonService commonService = new CommonService();
		EmployeeService empService = new EmployeeService();
		System.out.println("Welcome to Employee Portal of ABC Bank Inc..!!!!!!!!!!!!!!!");
		String user = "Employee";
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		loop: while (true) {
			initialInstructions();
			String menu = scan.next();
			selection: switch (menu) {
			case "1": {
				try {
					log.info(" Employee Login create started");
					System.out.println("Enter User Name: ");
					String userName = scan.next();
					System.out.println("Enter User Password: ");
					String userPassword = scan.next();
					int userId = commonService.getUserId(user);
					commonService.createLogin(new LoginDetail(userName, userPassword, userId));
				} catch (Exception e) {
					log.debug(" Employee Login create failed");
					e.printStackTrace();
				}
				break selection;
			}
			case "2": {
				try {
					log.info(" Employee Login Started");
					System.out.println("Enter User Name: ");
					String userName = scan.next();
					System.out.println("Enter User Password: ");
					String userPassword = scan.next();

					boolean loginStatus = commonService.userLogin(userName, userPassword, user);
					int loginid = commonService.getLoginId(userName, userPassword);
					if (loginStatus == true) {
						log.info(" Employee Login Success !!!!!!!!!!!");
						Employee emp = empService.getEmployeeDetails(userName, userPassword);
						System.out.println("\nEmployee Login As: ==================================================");
						System.out.println("Employee Id: " + emp.getEmployee_id() + "\t\t\t\tEmployee Name: "
								+ emp.getEmployee_fname() + " " + emp.getEmployee_lname());
						System.out.println("Employee Role: " + user + "\t\t\tEmployee Login: "
								+ emp.getEmployee_login().getLogin_user_name());
						System.out.println("========================================================================");
						Emploop: while (true) {
							employeeInstruction();
							String empSelection = scan.next();
							employeeSelection: switch (empSelection) {
							case "1": {
								System.out.println("Enter Account Numebr to View Account Information: ");
								int accountNumber = scan.nextInt();
								CustomerAccountDetails accountInfo = empService.viewAccountInformation(accountNumber);
								System.out.println("Account Information: ==========================================");
								System.out.println("Account Number: " + accountInfo.getCustomer_account_Numer()
										+ "\t\tAccount Type: " + accountInfo.getCustomer_account_Type());
								System.out.println("Customer Id: " + accountInfo.getCustomer_id()
										+ "\t\t\tAccount Holder Name: " + accountInfo.getCustomer_name());
								System.out.println("===============================================================");
								break employeeSelection;
							}
							case "2": {
								System.out.println("Enter Account Numebr to View Account Balance: ");
								int accountNumber = scan.nextInt();
								CustomerAccountDetails accountInfo = empService.viewAccountInformation(accountNumber);
								System.out.println("Account Balance Information: =================================");
								System.out.println("Account Number: " + accountInfo.getCustomer_account_Numer()
										+ "\t\tAccount Type: " + accountInfo.getCustomer_account_Type()
										+ "\t\tAccount Balance: " + accountInfo.getCustomer_balance());
								System.out.println("===============================================================");
								break employeeSelection;
							}
							case "3": {
								System.out.println("Enter Account Numebr to View Personal Information: ");
								int accountNumber = scan.nextInt();
								CustomerAccountDetails accountInfo = empService.viewAccountInformation(accountNumber);
								System.out.println("Personal Information: ==========================================");
								System.out.println("Customer Id: " + accountInfo.getCustomer_id()
										+ "\t\t\tCustomer Name: " + accountInfo.getCustomer_name() + "\t\tPhone: "
										+ accountInfo.getCustomer_phone());
								System.out.println("Account Number: " + accountInfo.getCustomer_account_Numer()
										+ "\t\tCustomer SSN: " + accountInfo.getCustomer_ssn()
										+ "\t\t\tCustomer Email: " + accountInfo.getCustomer_email());
								System.out.println("Customer Address: " + accountInfo.getCustomer_address());
								System.out.println("===============================================================");
								break employeeSelection;
							}
							case "4": {
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
								break employeeSelection;
							}
							case "5": {

								log.info("create Employee account started");
								System.out.println("Enter First Name: ");
								String f_name = scan.next();
								System.out.println("Enter Last Name: ");
								String l_name = scan.next();
								System.out.println("Enter email Number: ");
								String email = scan.next();
								LoginDetail login = new LoginDetail(loginid);
								empService.createEmployeeAccount(new Employee(f_name, l_name, email, login));
								break employeeSelection;
							}
							default:
								System.out.println("Wrong Input!!!!!!! Try Again");
								break employeeSelection;
							case "q":
								System.out.println("Thank you for Using");
								break Emploop;
							}
						}
					} else {
						log.warn(" Employee Login Failed !!!!!!!!!!!");
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
		System.out.println("\n\nPlease Enter 1 to Create new Login OR Enter 2 for Login..");
		System.out.println("Enter 'q' for Quit/Log Out");
		System.out.println("Enter Here: ");
	}

	public static void employeeInstruction() {
		System.out.println("Enter 1 to view Account Information \nEnter 2 to view Account Balance "
				+ "\nEnter 3 to view Personal Information \nEnter 4 to view and Approve Pending Approvals "
				+ "\nEnter 5 to Create Employee Account \nOR Enter q to LogOut/Quit");
	}
}
