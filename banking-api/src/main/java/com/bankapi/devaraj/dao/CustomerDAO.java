package com.bankapi.devaraj.dao;

import java.util.List;

import com.bankapi.devaraj.model.Customer;

public interface CustomerDAO {
	
	public boolean createCustomerAccount(Customer customer);
	public boolean updateCustomerAccount(Customer accountNumber);
	public List<Customer> getAllCustomer();
	public boolean deleteCustomerAccount(Customer accountNumber);
	public int getCustomerId(String email, int ssn);
}
