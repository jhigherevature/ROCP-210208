package com.bankingapi.devaraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bankingapi.devaraj.utility.ConnectionUtility;

public class AdminDAOImpl implements AdminDAO {

	public static Logger log = LogManager.getLogger(AdminDAO.class);

	@Override
	public boolean approveAcccount(int customer_id) {
		log.info("approve account method invoked");
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			String query = "begin transaction; "
					+ "insert into bankapi.customers select * from bankapi.pending_approvals where customer_id = ?; "
					+ "delete from bankapi.pending_approvals where customer_id =?;"
					+ "insert into bankapi.account_details values(default, ?, 0.00);" 
					+ "commit;";
			ps = conn.prepareStatement(query);
			ps.setInt(1, customer_id);
			ps.setInt(2, customer_id);
			ps.setInt(3, customer_id);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.debug("approve account failed");
			e.printStackTrace();
			return false;
		}
		log.info("approve account success");
		return true;
	}

	@Override
	public int getrecentApprovedAccountNumber() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		int recenetApprovedAccount = 0;
		try (Connection conn = ConnectionUtility.getConnection()) {
			ps = conn.prepareStatement(
					"select account_number from bankapi.account_details ORDER BY account_number DESC LIMIT 1");
			rs = ps.executeQuery();
			while (rs.next()) {
				recenetApprovedAccount = rs.getInt("account_number");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return recenetApprovedAccount;
	}

	@Override
	public boolean insertToCustomerAccounttype(int customer_id, int accountNumber) {
		log.info("insert to customer accoutn type invoked");
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "begin transaction; " 
					+ "insert into bankapi.customer_account_type "
					+ "select * from bankapi.tmp_account where customer_id = ?; "
					+ "update bankapi.customer_account_type set cs_account_number = ? where customer_id = ? and cs_account_number is null; "
					+ "delete from bankapi.tmp_account where customer_id = ?; " + "commit;";
			ps = conn.prepareStatement(query);
			ps.setInt(1, customer_id);
			ps.setInt(2, accountNumber);
			ps.setInt(3, customer_id);
			ps.setInt(4, customer_id);
			ps.executeUpdate();

		} catch (SQLException e) {
			log.info("insert to customer accoutn type failed");
			e.printStackTrace();
		}
		log.info("insert to customer accoutn type completed");
		return true;
	}

	@Override
	public boolean insertToAccountdetails(int customerId) {
		log.info(" insert to accoutn details invoked");
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			ps = conn.prepareStatement("INSERT INTO bankapi.account_details VALUES (default, ?, 0.00)");
			ps.setInt(1, customerId);
			ps.executeUpdate();

		} catch (SQLException e) {
			log.debug("insert to account details type failed");
			e.printStackTrace();
		}
		log.info("insert to account details completed");
		return true;
	}

	public int getCustomerAccountType(int customerId) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		int accountType = 0;
		try (Connection conn = ConnectionUtility.getConnection()) {
			ps = conn.prepareStatement("SELECT account_type FROM bankapi.tmp_account WHERE customer_id = ?");
			ps.setInt(1, customerId);
			rs = ps.executeQuery();
			while (rs.next()) {
				accountType = rs.getInt("account_type");
			}

		} catch (SQLException e) {
			log.debug("insert to account details type failed");
			e.printStackTrace();
		}
		log.info("insert to account details completed");
		return accountType;
	}

	public boolean insertAccountType(int customerId, int accountType, int accountNumber) {
		log.info("insert to accoutn type invoked");
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to database");
			ps = conn.prepareStatement("INSERT INTO bankapi.customer_account_type VALUES (default, ?, ?, ?)");
			ps.setInt(1, customerId);
			ps.setInt(2, accountType);
			ps.setInt(3, accountNumber);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.debug("insert to account type failed");
			e.printStackTrace();
		}
		log.info("insert to account type completed");
		return true;
	}

	@Override
	public boolean depositWithdrawupdate(int accountNumber, double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
