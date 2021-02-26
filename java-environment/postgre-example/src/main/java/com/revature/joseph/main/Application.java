package com.revature.joseph.main;

import com.revature.joseph.dao.EmployeeDAOImpl_postgre;
import com.revature.joseph.model.Employee;
import com.revature.joseph.services.CustomerActionsService;

public class Application {

	public static void main(String[] args) {

		Integer value = (int)UserInput.getNumericalInput("How much do you want to deposit?");
		/*
		 * Example Logic for a menu to selection options when logged in as customer: 
		 */
		switch(value) {
		case 1:
			CustomerActionsService serv = new CustomerActionsService();
			serv.checkBalance(null, null);
		case 2:
			CustomerActionsService serv = new CustomerActionsService();
			serv.withdraw(null, null);
		case 3:
			CustomerActionsService serv = new CustomerActionsService();
			serv.deposit(null, null);
		}
		
		/*
		 * The active User would be a reference to a user that is logged in
		 */
//		User activeUser = null;
//		
//		// loginMethod > return a user from the DB...
//		
//		activeUser = loginMethod();
//		
//		checkBalance(activeUser, account);
		
//		try {
//			ConnectionUtility.getConnection();
//			System.out.println("Connection Worked!");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
		
		EmployeeDAOImpl_postgre eDaoP = new EmployeeDAOImpl_postgre();
		Employee test = eDaoP.selectEmployee("Patty");
		System.out.println(test);
		
//		EmployeeDAO edao = new EmployeeDAOImpl_postgre();
//		Employee e = edao.selectEmployee("Hello");
//		System.out.println(e);
//		List<Employee> employees = edao.selectAllEmployees();
		
//		
//		for (Employee e : employees) {
//			System.out.println(e);
//		}
//		Employee emp = new Employee(null,"Java Again!", 95000.00, "Developer");
//		boolean didItWork = edao.insertIntoEmployees(emp);
//		System.out.println(didItWork);
		
		
//		AuthenticationService auth = new AuthenticationService();
//		auth.authenticate("patCeo", "pass");
//		// SELECT * FROM examples.login WHERE login.login_name = "patCEO" AND login_pass = "pass";
//		auth.authenticate("merrymatt", "pass");
//		auth.authenticate("philyTheKid", "pass");

	}

}
