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

import com.bankingapi.devaraj.model.AccountType;
import com.bankingapi.devaraj.model.CustomerAccountType;
import com.bankingapi.devaraj.utility.ConnectionUtility;

public class AccountTypeDAOImpl implements AccountTypeDAO {

	public static Logger log = LogManager.getLogger(UserDAOImpl.class);

	@Override
	public boolean createAccountType(AccountType acctType) {
		log.info("create account type invoked");
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("INSERT INTO bankapi.account_type (account_type) VALUES(?)");
			ps.setString(1, acctType.getAccount_type());
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
	public List<AccountType> listAllAccountType() {
		log.info("list account type invoked");
		Statement stmt = null;
		ResultSet rs = null;
		List<AccountType> acctTypes = new ArrayList<>();

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM bankapi.account_type");

			while (rs.next()) {
				AccountType accountType = new AccountType();
				accountType.setAccount_type_id(rs.getInt("account_type_id"));
				accountType.setAccount_type(rs.getString("account_type"));
				acctTypes.add(accountType);
			}

		} catch (SQLException e) {
			log.info("list account type failed");
			e.printStackTrace();
			return null;
		}
		log.info("list account type completed");
		return acctTypes;
	}

	@Override
	public boolean removeAccountType(int account_type_id) {
		log.info("remove account type invoked");
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("DELETE FROM bankapi.account_type WHERE account_type_id =?");
			ps.setInt(1, account_type_id);
			ps.executeUpdate();

		} catch (SQLException e) {
			log.debug("remove account type failed");
			e.printStackTrace();
			return false;
		}
		log.info("remove account type completed");
		return true;
	}

	@Override
	public boolean insertCustomerAccountType(CustomerAccountType customerAccount) {
		log.info("insert customer account type invoked");
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("INSERT INTO bankapi.customer_account_type VALUES(default,?,?)");
			ps.setInt(1, customerAccount.getCustomer_id());
			ps.setInt(2, customerAccount.getAccount_type());
			ps.executeUpdate();

		} catch (SQLException e) {
			log.debug("insert customer account type failed");
			e.printStackTrace();
			return false;
		}
		log.info("insert customer account type success");
		return true;
	}

}
