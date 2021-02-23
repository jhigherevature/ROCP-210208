package com.revature.joseph.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.joseph.connectionutil.ConnectionUtility;
import com.revature.joseph.model.Employee;

public class LoginDAOImpl implements LoginDAO {

	public static Logger log = LogManager.getLogger(LoginDAOImpl.class);
	
	@Override
	public Employee getEmployeeByLogin(String name, String pass) {
		log.info("getEmployeeByLogin invoked!");
		Employee emp = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		EmployeeDAO eDao = ConnectionUtility.getEmployeeDAO();
		try (Connection conn = ConnectionUtility.getConnection()) {
			ps = conn.prepareStatement("SELECT * FROM examples.login WHERE login_name=? AND login_pass=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			rs = ps.executeQuery();

			while (rs.next()) {
				emp = eDao.selectEmployee(rs.getInt(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return emp;
	}

}
