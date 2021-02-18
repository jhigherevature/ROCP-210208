package com.revature.joseph.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.joseph.connectionutil.ConnectionUtility;
import com.revature.joseph.model.Employee;

/*
 * This class will implement EmployeeDAO because we will use it
 * to communicate with a database, particularly a postgre database!
 */
public class EmployeeDAOImpl_postgre implements EmployeeDAO {

	@Override
	public Employee selectEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee selectEmployee(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertIntoEmployees(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Employee> selectAllEmployees() {
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		// We use try-with-resources to estbalish a connection
		try (Connection conn = ConnectionUtility.getConnection()) {
			// If the connection was successful:
			String query = "SELECT * FROM examples.employees";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmp_id(rs.getInt(1));
				emp.setEmp_name(rs.getString(2));
				emp.setEmp_salary(rs.getDouble(3));
				emp.setEmp_title(rs.getString(4));
				
				employees.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
		return employees;
	}

	@Override
	public Boolean removeEmployee(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
