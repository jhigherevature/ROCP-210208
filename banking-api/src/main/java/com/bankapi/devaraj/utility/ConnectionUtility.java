package com.bankapi.devaraj.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	
	public static Connection getConnection() throws SQLException {

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "Durga@1234";
		return DriverManager.getConnection(url, user, password);
	}
}


