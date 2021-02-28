package com.bankingapi.devaraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bankingapi.devaraj.model.User;
import com.bankingapi.devaraj.utility.ConnectionUtility;

public class UserDAOImpl implements UserDAO {

	public static Logger log = LogManager.getLogger(UserDAOImpl.class);

	@Override
	public boolean createUser(User user) {
		log.info("create user invoked");
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("INSERT INTO bankapi.users (user_role) VALUES(?);");
			ps.setString(1, user.getUser_role());
			ps.executeUpdate();
		} catch (SQLException e) {
			log.debug("create user failed");
			e.printStackTrace();
			return false;
		}
		log.info("create user success");
		return true;
	}

	@Override
	public List<User> listAllUser() {
		log.info("list user invoked");
		Statement stmt = null;
		ResultSet rs = null;
		List<User> users = new ArrayList<>();

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM bankapi.users");

			while (rs.next()) {
				User user = new User();
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_role(rs.getString("user_role"));
				users.add(user);
			}

		} catch (SQLException e) {
			log.debug("list user failed");
			e.printStackTrace();
			return null;
		}
		log.info("list user completed");
		return users;
	}

	@Override
	public boolean removeUser(int user_id) {
		log.info("remove user invoked");
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("DELETE FROM bankapi.users WHERE user_id =?");
			ps.setInt(1, user_id);
			ps.executeUpdate();

		} catch (SQLException e) {
			log.debug("remove user failed");
			e.printStackTrace();
			return false;
		}
		log.info("remove user completed");
		return true;
	}

	@Override
	public int getUserId(String user) {
		log.info("get user id invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		int userId = 0;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("SELECT user_id FROM bankapi.users WHERE user_role =?");
			ps.setString(1, user);
			rs = ps.executeQuery();
			while (rs.next()) {
				userId = rs.getInt("user_id");
			}

		} catch (SQLException e) {
			log.debug("remove user id failed");
			e.printStackTrace();
			return 0;
		}
		log.info("get user id completed");
		return userId;
	}
}
