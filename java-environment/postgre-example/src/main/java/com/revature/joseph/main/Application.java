package com.revature.joseph.main;

import java.util.List;

import com.revature.joseph.dao.EmployeeDAO;
import com.revature.joseph.dao.EmployeeDAOImpl_postgre;
import com.revature.joseph.model.Employee;

public class Application {

	public static void main(String[] args) {
		EmployeeDAO edao = new EmployeeDAOImpl_postgre();
		List<Employee> employees = edao.selectAllEmployees();
		
		for (Employee e : employees) {
			System.out.println(e);
		}
		
//		Employee emp = new Employee(null,"Java Again!", 95000.00, "Developer");
//		boolean didItWork = edao.insertIntoEmployees(emp);
//		System.out.println(didItWork);
	}

}
