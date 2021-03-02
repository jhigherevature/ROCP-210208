package com.bankingapi.devaraj.dao;

import java.util.List;

import com.bankingapi.devaraj.model.Customer;
import com.bankingapi.devaraj.model.CustomerAccountDetails;

public interface CustomerDAO {
	
	public boolean createCustomerAccount(Customer customer);
	public boolean updateCustomerAccount(Customer accountNumber);
	public List<Customer> getAllCustomer();
	public boolean deleteCustomerfromPendingApproval(int customerId);
	public int getCustomerId(String email, int ssn);
	public List<CustomerAccountDetails> getCustomerAccountsDetails(String username, String password);
	public List<CustomerAccountDetails> getAllCustomersAccountDetails();
	public CustomerAccountDetails getCustomerAccountInfo(String username, String password, int accountNumber);
	public boolean depositWithdrawUpdate(String username, String password, int accountNumber, double updatedAmount);
	public double getBalanceByAccountNumber(int accountNumber);
	public boolean updateAccountBalanceByAccountNumber(int accountNumber, double updatedBalance);
}
