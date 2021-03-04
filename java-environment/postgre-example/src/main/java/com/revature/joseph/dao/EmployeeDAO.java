package com.revature.joseph.dao;

import java.util.List;

import com.revature.joseph.model.Employee;

/*
 * DAO stands for "Data Access Object"
 * The DAO design pattern attempts to create an architecture that mirrors
 * your database implementation (structure for tables, etc...) and passes
 * information to your database, using that structure
 * 
 * Your DAO interface should correspond to the methods used
 * for communication with your database, related to a particular
 * table
 */
public interface EmployeeDAO {
	public Employee selectEmployee(Integer id);
	public Employee selectEmployee(String name);
	
	public Boolean insertIntoEmployees(Employee emp); // creates new record in Employee table
	public List<Employee> selectAllEmployees();
	public Boolean removeEmployee(Integer id);
	public Boolean updateEmployee(Employee emp);
}

		/*emp_id INTEGER PRIMARY KEY, -- ID will be used to identify employees
		emp_name VARCHAR(50), -- VARCHAR is typically used for string data
		emp_salary DECIMAL,
		emp_title VARCHAR(20)*/