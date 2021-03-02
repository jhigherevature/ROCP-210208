package com.bankingapi.devaraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bankingapi.devaraj.model.Customer;
import com.bankingapi.devaraj.model.CustomerAccountDetails;
import com.bankingapi.devaraj.utility.ConnectionUtility;

public class CustomerDAOImpl implements CustomerDAO {

	public static Logger log = LogManager.getLogger(UserDAOImpl.class);

	@Override
	public boolean createCustomerAccount(Customer customer) {
		log.info("create customer account invoked");

		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("INSERT INTO bankapi.pending_approvals VALUES(default,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, customer.getCustomer_fname());
			ps.setString(2, customer.getCustomer_lname());
			ps.setString(3, customer.getCustomer_phone());
			ps.setInt(4, customer.getCustomer_ssn());
			ps.setString(5, customer.getCustomer_email());
			ps.setString(6, customer.getCustomer_street_address());
			ps.setString(7, customer.getCustomer_city());
			ps.setString(8, customer.getCustomer_state());
			ps.setInt(9, customer.getCustomer_zipcode());
			ps.setString(10, customer.getCustomer_country());
			ps.setInt(11, customer.getCustomer_account_login());
			ps.executeUpdate();

		} catch (SQLException e) {
			log.debug("create customer account failed");
			e.printStackTrace();
			return false;
		}
		log.info("create customer account success");
		return true;
	}

	@Override
	public boolean updateCustomerAccount(Customer accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomerfromPendingApproval(int customerId) {
		log.info("delete customer from pending approval invoked");
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("delete customer from pending approval invoked");
			ps = conn.prepareStatement("DELETE FROM bankapi.pending_approvals where customer_id = ? ");
			ps.setInt(1, customerId);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.debug("get customer from pending approval failed");
			e.printStackTrace();
			return false;
		}
		log.info("delete customer from pending approval completed");
		return true;
	}

	@Override
	public int getCustomerId(String email, int ssn) {
		log.info("get customer id invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		int userId = 0;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connect to data base");
			ps = conn.prepareStatement(
					"SELECT customer_id FROM bankapi.pending_approvals WHERE customer_email =? AND customer_ssn = ?");
			ps.setString(1, email);
			ps.setInt(2, ssn);
			rs = ps.executeQuery();
			while (rs.next()) {
				userId = rs.getInt("customer_id");
			}
		} catch (SQLException e) {
			log.debug("get customer id failed");
			e.printStackTrace();
		}
		log.info("get customer id completed");
		return userId;
	}

	@Override
	public List<CustomerAccountDetails> getCustomerAccountsDetails(String username, String password) {
		// if the customer has more than one accounts Eg: saving and checking
		log.info("get customer account details invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CustomerAccountDetails> customerDetail = new ArrayList<>();
		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "select * from bankapi.customers\r\n"
					+ "join bankapi.login_details on bankapi.login_details.login_details_id = bankapi.customers.customer_account_login "
					+ "join bankapi.customer_account_type on bankapi.customers.customer_id = bankapi.customer_account_type.customer_id "
					+ "join bankapi.account_type on bankapi.account_type.account_type_id = bankapi.customer_account_type.cs_account_type "
					+ "join bankapi.account_details on bankapi.customer_account_type.cs_account_number = bankapi.account_details.account_number "
					+ "where login_user_name = ? and login_password = ?;";
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while (rs.next()) {
				CustomerAccountDetails csDetail = new CustomerAccountDetails();
				csDetail.setCustomer_id(rs.getInt("customer_id"));
				csDetail.setCustomer_account_Numer(rs.getInt("account_number"));
				csDetail.setCustomer_name(rs.getString("customer_fname") + " " + rs.getString("customer_lname"));
				csDetail.setCustomer_phone(rs.getString("customer_phone"));
				csDetail.setCustomer_email(rs.getString("customer_email"));
				csDetail.setCustomer_address(rs.getString("customer_street_address") + ", "
						+ rs.getString("customer_city") + ", " + rs.getString("customer_state") + ", "
						+ Integer.toString(rs.getInt("customer_zipcode")) + ", " + rs.getString("customer_country"));
				csDetail.setCustomer_ssn(rs.getInt("customer_ssn"));
				csDetail.setCustomer_account_Type(rs.getString("account_type"));
				csDetail.setCustomer_balance(rs.getDouble("account_balance"));
				customerDetail.add(csDetail);
			}

		} catch (SQLException e) {
			log.debug("get customer account details failed");
			e.printStackTrace();
		}
		log.info("get customer account details completed");
		return customerDetail;
	}

	@Override
	public CustomerAccountDetails getCustomerAccountInfo(String username, String password, int accountNumber) {
		log.info("get customer account details invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		CustomerAccountDetails csDetail = new CustomerAccountDetails();
		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "select * from bankapi.customers "
					+ "join bankapi.login_details on bankapi.login_details.login_details_id = bankapi.customers.customer_account_login "
					+ "join bankapi.customer_account_type on bankapi.customers.customer_id = bankapi.customer_account_type.customer_id "
					+ "join bankapi.account_type on bankapi.account_type.account_type_id = bankapi.customer_account_type.cs_account_type "
					+ "join bankapi.account_details on bankapi.customer_account_type.cs_account_number = bankapi.account_details.account_number "
					+ "where login_user_name = ? and login_password = ? and account_number = ?";
			ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setInt(3, accountNumber);
			rs = ps.executeQuery();
			while (rs.next()) {
				csDetail.setCustomer_id(rs.getInt("customer_id"));
				csDetail.setCustomer_account_Numer(rs.getInt("account_number"));
				csDetail.setCustomer_name(rs.getString("customer_fname") + " " + rs.getString("customer_lname"));
				csDetail.setCustomer_phone(rs.getString("customer_phone"));
				csDetail.setCustomer_email(rs.getString("customer_email"));
				csDetail.setCustomer_address(rs.getString("customer_street_address") + ", "
						+ rs.getString("customer_city") + ", " + rs.getString("customer_state") + ", "
						+ Integer.toString(rs.getInt("customer_zipcode")) + ", " + rs.getString("customer_country"));
				csDetail.setCustomer_ssn(rs.getInt("customer_ssn"));
				csDetail.setCustomer_account_Type(rs.getString("account_type"));
				csDetail.setCustomer_balance(rs.getDouble("account_balance"));

			}

		} catch (SQLException e) {
			log.debug("get customer account details failed");
			e.printStackTrace();
		}
		log.info("get customer account details completed");
		return csDetail;
	}

	@Override
	public boolean depositWithdrawUpdate(String username, String password, int accountNumber, double updatedAmount) {
		log.info("update customer account balance invoked");
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to database");
			String query = "update bankapi.account_details set account_balance = ? " + "from bankapi.customers "
					+ "join bankapi.login_details on bankapi.login_details.login_details_id = bankapi.customers.customer_account_login "
					+ "where login_user_name = ? and login_password = ? and account_number = ?";
			ps = conn.prepareStatement(query);
			ps.setDouble(1, updatedAmount);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setInt(4, accountNumber);
			ps.executeUpdate();

		} catch (SQLException e) {
			log.debug("update customer account balance failed");
			e.printStackTrace();
		}
		log.info("update customer account balance completed");
		return true;
	}

	@Override
	public double getBalanceByAccountNumber(int accountNumber) {
		log.info("get account balance by account number invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		double accountBalance = 0.00;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to database");
			ps = conn.prepareStatement("SELECT account_balance FROM bankapi.account_details WHERE account_number=?");
			ps.setInt(1, accountNumber);
			rs = ps.executeQuery();
			while (rs.next()) {
				accountBalance = rs.getDouble("account_balance");
			}
		} catch (SQLException e) {
			log.debug("get account balance by account number failed");
			e.printStackTrace();
		}
		log.info("get account balance by account number completed");
		return accountBalance;
	}

	@Override
	public boolean updateAccountBalanceByAccountNumber(int accountNumber, double updatedBalance) {
		log.info("update account balance by account number invoked");
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to database");
			ps = conn.prepareStatement(
					"UPDATE bankapi.account_details SET account_balance = ? where account_number = ?");
			ps.setDouble(1, updatedBalance);
			ps.setInt(2, accountNumber);
			ps.executeUpdate();
		} catch (SQLException e) {
			log.debug("update account balance by account number failed");
			e.printStackTrace();
		}
		log.info("update account balance by account number completed");
		return false;
	}

	@Override
	public List<CustomerAccountDetails> getAllCustomersAccountDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
