package com.bankapi.devaraj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bankapi.devaraj.model.Customer;
import com.bankapi.devaraj.utility.ConnectionUtility;

public class CustomerDAOImpl implements CustomerDAO{
	
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
	public boolean deleteCustomerAccount(Customer accountNumber) {
		// TODO Auto-generated method stub
		return false;
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
	
}
