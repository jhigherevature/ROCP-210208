package com.revature.joseph.connectionutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* This class will be used to manage the creation of our connection
 * to the database!
 */
public class ConnectionUtility {
	public static Connection getConnection() throws SQLException {
		/*
		 * The getConnection method of the DriverManager
		 * uses the following syntax:
		 * getConnection(db_url, username, password);
		 * 
		 * url syntax: "jdbc:postgresql://[host_location]:[port]/[db_name]"
		 */
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "joe";
		String pass = "password";
		return DriverManager.getConnection(url, user, pass);
	}
	
	// This main method is used to test our connection!
	public static void main(String[] args) {
		try (Connection conn = ConnectionUtility.getConnection()) {
			System.out.println("The Connection was successful!");
		} catch(SQLException e) {
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
	}
}
