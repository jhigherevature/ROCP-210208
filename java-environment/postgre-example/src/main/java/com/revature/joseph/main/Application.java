package com.revature.joseph.main;

import java.sql.SQLException;
import java.util.List;

import com.revature.joseph.connectionutil.ConnectionUtility;
import com.revature.joseph.dao.EmployeeDAO;
import com.revature.joseph.dao.EmployeeDAOImpl_postgre;
import com.revature.joseph.model.Employee;
import com.revature.joseph.services.AuthenticationService;

public class Application {

	public static void main(String[] args) {
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
