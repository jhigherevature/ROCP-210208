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
import com.bankingapi.devaraj.model.Employee;
import com.bankingapi.devaraj.model.LoginDetail;
import com.bankingapi.devaraj.utility.ConnectionUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	public static Logger log = LogManager.getLogger(UserDAOImpl.class);

	@Override
	public List<CustomerAccountDetails> listAllAccounts() {
		log.info("list all customers account invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<CustomerAccountDetails> csDetail = new ArrayList<>();
		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "select * from bankapi.customers "
					+ "join bankapi.login_details on bankapi.login_details.login_details_id = bankapi.customers.customer_account_login "
					+ "join bankapi.customer_account_type on bankapi.customers.customer_id = bankapi.customer_account_type.customer_id "
					+ "join bankapi.account_type on bankapi.account_type.account_type_id = bankapi.customer_account_type.cs_account_type "
					+ "join bankapi.account_details on bankapi.customer_account_type.cs_account_number = bankapi.account_details.account_number ";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				CustomerAccountDetails customerDetail = new CustomerAccountDetails();
				customerDetail.setCustomer_id(rs.getInt("customer_id"));
				customerDetail.setCustomer_account_Numer(rs.getInt("account_number"));
				customerDetail.setCustomer_name(rs.getString("customer_fname") + " " + rs.getString("customer_lname"));
				customerDetail.setCustomer_phone(rs.getString("customer_phone"));
				customerDetail.setCustomer_email(rs.getString("customer_email"));
				customerDetail.setCustomer_address(rs.getString("customer_street_address") + ", "
						+ rs.getString("customer_city") + ", " + rs.getString("customer_state") + ", "
						+ Integer.toString(rs.getInt("customer_zipcode")) + ", " + rs.getString("customer_country"));
				customerDetail.setCustomer_ssn(rs.getInt("customer_ssn"));
				customerDetail.setCustomer_account_Type(rs.getString("account_type"));
				customerDetail.setCustomer_balance(rs.getDouble("account_balance"));
				csDetail.add(customerDetail);
			}
		} catch (SQLException e) {
			log.debug("list all customers account failed");
			e.printStackTrace();
		}
		log.info("list all customers account completed");
		return csDetail;
	}

	@Override
	public CustomerAccountDetails getAccountDetails(int accountNumber) {

		log.info("get account details invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		CustomerAccountDetails customerDetail = new CustomerAccountDetails();
		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "select * from bankapi.customers "
					+ "join bankapi.login_details on bankapi.login_details.login_details_id = bankapi.customers.customer_account_login "
					+ "join bankapi.customer_account_type on bankapi.customers.customer_id = bankapi.customer_account_type.customer_id "
					+ "join bankapi.account_type on bankapi.account_type.account_type_id = bankapi.customer_account_type.cs_account_type "
					+ "join bankapi.account_details on bankapi.customer_account_type.cs_account_number = bankapi.account_details.account_number "
					+ "WHERE account_number = ?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, accountNumber);
			rs = ps.executeQuery();
			while (rs.next()) {
				customerDetail.setCustomer_id(rs.getInt("customer_id"));
				customerDetail.setCustomer_account_Numer(rs.getInt("account_number"));
				customerDetail.setCustomer_name(rs.getString("customer_fname") + " " + rs.getString("customer_lname"));
				customerDetail.setCustomer_phone(rs.getString("customer_phone"));
				customerDetail.setCustomer_email(rs.getString("customer_email"));
				customerDetail.setCustomer_address(rs.getString("customer_street_address") + ", "
						+ rs.getString("customer_city") + ", " + rs.getString("customer_state") + ", "
						+ Integer.toString(rs.getInt("customer_zipcode")) + ", " + rs.getString("customer_country"));
				customerDetail.setCustomer_ssn(rs.getInt("customer_ssn"));
				customerDetail.setCustomer_account_Type(rs.getString("account_type"));
				customerDetail.setCustomer_balance(rs.getDouble("account_balance"));
			}
		} catch (SQLException e) {
			log.debug("get customer account detail failed");
			e.printStackTrace();
		}
		log.info("get customer account detail completed");
		return customerDetail;
	}

	@Override
	public List<Customer> listPendingApprovals() {
		log.info("list all customers account invoked");
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Customer> customer = new ArrayList<>();
		try (Connection conn = ConnectionUtility.getConnection()) {
			ps = conn.prepareStatement("SELECT * FROM bankapi.pending_approvals");
			rs = ps.executeQuery();
			while (rs.next()) {
				Customer cs = new Customer();
				cs.setCustomer_id(rs.getInt("customer_id"));
				cs.setCustomer_fname(rs.getString("customer_fname"));
				cs.setCustomer_lname(rs.getString("customer_lname"));
				cs.setCustomer_phone(rs.getString("customer_phone"));
				cs.setCustomer_ssn(rs.getInt("customer_ssn"));
				cs.setCustomer_email(rs.getString("customer_email"));
				cs.setCustomer_street_address(rs.getString("customer_street_address"));
				cs.setCustomer_city(rs.getString("customer_city"));
				cs.setCustomer_state(rs.getString("customer_state"));
				cs.setCustomer_zipcode(rs.getInt("customer_zipcode"));
				cs.setCustomer_country(rs.getString("customer_country"));
				cs.setCustomer_account_login(rs.getInt("customer_account_login"));
				customer.add(cs);
			}
		} catch (SQLException e) {
			log.debug("list all customers account failed");
			e.printStackTrace();
		}
		log.info("list all customers account completed");
		return customer;
	}

	@Override
	public boolean insertIntoEmployee(Employee employee) {
		log.info("create employee account invoked");

		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("INSERT INTO bankapi.employees VALUES(default,?,?,?,?)");
			ps.setString(1, employee.getEmployee_fname());
			ps.setString(2, employee.getEmployee_lname());
			ps.setString(3, employee.getEmployee_email());
			ps.setInt(4, employee.getEmployee_login().getLogin_details_id());
			ps.executeUpdate();

		} catch (SQLException e) {
			log.debug("create employee account failed");
			e.printStackTrace();
			return false;
		}
		log.info("create employee account completed");
		return true;
	}

	@Override
	public Employee getEmployeeInformation(String username, String password) {
		log.info("get Employee information invoked!");
		ResultSet rs = null;
		PreparedStatement ps = null;
		Employee employee = new Employee();
		LoginDetail login = new LoginDetail();
		try (Connection conn = ConnectionUtility.getConnection()) {
			log.info("successfully connected to data base");
			ps = conn.prepareStatement("SELECT * FROM bankapi.login_details "
					+ "JOIN bankapi.users on bankapi.users.user_id = bankapi.login_details.user_role "
					+ "JOIN bankapi.employees on bankapi.employees.employee_login = bankapi.login_details.login_details_id "
					+ "WHERE login_user_name = ? AND login_password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while (rs.next()) {
				employee.setEmployee_fname(rs.getString("employee_fname"));
				employee.setEmployee_id(rs.getInt("employee_id"));
				employee.setEmployee_lname(rs.getString("employee_lname"));
				employee.setEmployee_email(rs.getString("employee_email"));
				login.setLogin_user_name(rs.getString("login_user_name"));
				employee.setEmployee_login(login);
			}
		} catch (SQLException e) {
			log.info("get Employee information failed");
			e.printStackTrace();
		}
		log.info("get Employee information completed");
		return employee;
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
					"SELECT customer_id FROM bankapi.customers WHERE customer_email =? AND customer_ssn = ?");
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
