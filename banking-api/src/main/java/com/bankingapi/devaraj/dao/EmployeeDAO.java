package com.bankingapi.devaraj.dao;

import java.util.List;

import com.bankingapi.devaraj.model.Customer;
import com.bankingapi.devaraj.model.CustomerAccountDetails;
import com.bankingapi.devaraj.model.Employee;

public interface EmployeeDAO {
	
	public List<CustomerAccountDetails> listAllAccounts();
	public CustomerAccountDetails getAccountDetails(int accountNumber);
	public List<Customer> listPendingApprovals();
	public boolean insertIntoEmployee(Employee employee);
	public Employee getEmployeeInformation(String username, String password);
	public int getCustomerId(String email, int ssn);

}
