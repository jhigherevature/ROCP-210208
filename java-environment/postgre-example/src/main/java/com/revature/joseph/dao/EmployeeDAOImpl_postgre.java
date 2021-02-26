package com.revature.joseph.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
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
		// This is our model that represents the data from our database
		Employee emp = null;
		
		// The ResultSet is a representation of the data from our DB
		ResultSet rs = null;
		
		// JDBC offers 3 statements, Simple, Prepared and Callable. We use
		// PreparedStatements when we want to pass parameters to the statement itself
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			// SELECT * FROM examples.employees WHERE emp_id = 1000;
			ps = conn.prepareStatement("SELECT * FROM examples.employees WHERE emp_id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();

			while (rs.next()) {
				emp = new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getString(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return emp;
	}

	@Override
	public Employee selectEmployee(String name) {
		Employee emp = new Employee();
		
		// Try to connect to DB, and if so perform try block
		try {
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "joe", "password");
			// prepared statements use a '?' to indicate a parameter marker for values to 
			// be inserted later in your sql statement
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM examples.employees WHERE emp_name =?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			// Look at the values from the result set, and use the set methods to
			// populate the appropriate fields
			while (rs.next()) {
				// When we use the get methods for our result set
				// we reference the column associated from our table
				// in our case:
				// emp_id is column 1
				// emp_name is column 2
				// emp_salary is column 3
				// emp_title is column 4
				emp.setEmp_id(rs.getInt(1));
				emp.setEmp_name(rs.getString(2));
				emp.setEmp_salary(rs.getDouble(3));
				emp.setEmp_title(rs.getString(4));
			}
			
			// If the DB connection fails, we want to...
		} catch (SQLException e) {
			System.out.println("Something went wrong when trying to contact DB");
			e.printStackTrace();
			return null;
		}		
		// We want to return the created employee at the end of the method...
		return emp;
	}

	@Override
	public Boolean insertIntoEmployees(Employee emp) {
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			ps = conn.prepareStatement("INSERT INTO examples.employees "
					+ "VALUES(null,?,?,?)");
			
			ps.setString(1, emp.getEmp_name());
			ps.setDouble(2, emp.getEmp_salary());
			ps.setString(3, emp.getEmp_title());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<Employee> selectAllEmployees() {
		// regular statements should not be used if you need data
		// from a user location to prevent SQL Injection!
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Employee> employees = new ArrayList<Employee>();

		// We use try-with-resources to estbalish a connection
		try (Connection conn = ConnectionUtility.getConnection()) {
			// If the connection was successful:
			String query = "SELECT * FROM examples.employees";
			stmt = conn.createStatement();

			// Result Set is the information obtained from the query
			// A Set is a collection that does not contain duplicates!
			rs = stmt.executeQuery(query);

			/*
			 * rs.next() will return true if there is still information from our result set
			 * we have not looked through. Each time next() is called, it will look at the
			 * 'next' piece of information inside of our collection of data.
			 */
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
