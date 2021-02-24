package com.bankingapi.devaraj.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.bankingapi.devaraj.dao.EmployeeDAO;
import com.bankingapi.devaraj.dao.EmployeeDAOImpl;
import com.bankingapi.devaraj.dao.LoginDAO;
import com.bankingapi.devaraj.dao.LoginDAOImpl;

public class ConnectionUtility {
	
	public static Connection getConnection() throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "Durga@1234";
		return DriverManager.getConnection(url, user, password);
	}
	
	public static LoginDAO getLoginDAO() {
		return new LoginDAOImpl();
	}
	
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOImpl();
	} 
}
