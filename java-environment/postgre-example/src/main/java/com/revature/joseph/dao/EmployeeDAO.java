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
	public Boolean insertIntoEmployees(Employee emp);
	public List<Employee> selectAllEmployees();
	public Boolean removeEmployee(Integer id);
	public Boolean updateEmployee(Employee emp);
}
