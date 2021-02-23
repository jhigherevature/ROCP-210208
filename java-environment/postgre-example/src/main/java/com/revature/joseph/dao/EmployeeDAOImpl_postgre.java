package com.revature.joseph.dao;

import java.sql.Statement;
import java.sql.Connection;
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
		Employee emp = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertIntoEmployees(Employee emp) {
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			ps = conn.prepareStatement("INSERT INTO examples.employees VALUES(null,?,?,?)");

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
