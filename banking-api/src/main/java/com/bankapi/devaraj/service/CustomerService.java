package com.bankapi.devaraj.service;

import com.bankapi.devaraj.dao.AccountTypeDAOImpl;
import com.bankapi.devaraj.dao.CustomerDAOImpl;
import com.bankapi.devaraj.dao.LoginDAOImpl;
import com.bankapi.devaraj.dao.UserDAOImpl;
import com.bankapi.devaraj.model.Customer;
import com.bankapi.devaraj.model.CustomerAccountType;
import com.bankapi.devaraj.model.LoginDetail;

public class CustomerService {

	LoginDAOImpl loginservice = new LoginDAOImpl();
	UserDAOImpl userdao = new UserDAOImpl();
	CustomerDAOImpl customerdao = new CustomerDAOImpl();
	AccountTypeDAOImpl acctType = new AccountTypeDAOImpl();

	public void createCustomerLogin(LoginDetail login) {
		loginservice.createLogin(login);
	}

	public int getUserId(String user) {
		return userdao.getUserId(user);
	}

	public boolean customerLogin(String userName, String password) {
		return loginservice.getCustomerLogin(userName, password);
	}

	public int getLoginId(String userName, String password) {
		return loginservice.getLoginid(userName, password);
	}
	
	public boolean createCustomerAccount(Customer customer) {
		return customerdao.createCustomerAccount(customer);
	}
	
	public int getCustomerId(String email, int ssn) {
		return customerdao.getCustomerId(email, ssn);
	}
	
	public boolean insertCustomerAccountType(CustomerAccountType customerAccount) {
		return acctType.insertCustomerAccountType(customerAccount);
	}
}
