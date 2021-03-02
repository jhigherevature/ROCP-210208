package com.bankingapi.devaraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bankingapi.devaraj.model.LoginDetail;
import com.bankingapi.devaraj.utility.ConnectionUtility;

public class LoginDAOImpl implements LoginDAO {

	public static Logger log = LogManager.getLogger(UserDAOImpl.class);

	@Override
	public boolean createLogin(LoginDetail login) {
		log.info("create Login invoked");
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("INSERT INTO bankapi.login_details VALUES(default, ?,?,?)");
			ps.setString(1, login.getLogin_user_name());
			ps.setString(2, login.getLogin_password());
			ps.setInt(3, login.getUser_role());
			ps.executeUpdate();

		} catch (SQLException e) {
			log.debug("create account type failed");
			e.printStackTrace();
			return false;
		}
		log.info("create account type success");
		return true;
	}

	@Override
	public int getLoginid(String user, String password) {
		log.info("get Login id invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		int userId = 0;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connect to data base");
			ps = conn.prepareStatement(
					"SELECT login_details_id FROM bankapi.login_details WHERE login_user_name =? AND login_password = ?");
			ps.setString(1, user);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while (rs.next()) {
				userId = rs.getInt("login_details_id");
			}
		} catch (SQLException e) {
			log.debug("get login id failed");
			e.printStackTrace();
		}
		log.info("get login id completed");
		return userId;
	}

	@Override
	public boolean getCustomerLogin(String usereName, String Password, String user) {
		log.info("get customer login invoked!");
		ResultSet rs = null;
		PreparedStatement ps = null;
		boolean loginStatus = false;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement(
					"SELECT * FROM bankapi.login_details "
					+ "JOIN bankapi.users on bankapi.users.user_id = bankapi.login_details.user_role "
					+ "WHERE login_user_name = ? AND login_password = ?");
			ps.setString(1, usereName);
			ps.setString(2, Password);
			rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getString("login_user_name").equalsIgnoreCase(usereName)
						&& rs.getString("login_password").equals(Password) && user.equalsIgnoreCase(rs.getString("usr_role"))) {
					loginStatus = true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return loginStatus;
	}
}
