package com.bankingapi.devaraj.service;

import java.util.HashMap;
import java.util.List;

import com.bankingapi.devaraj.dao.AdminDAOImpl;
import com.bankingapi.devaraj.dao.CustomerDAOImpl;
import com.bankingapi.devaraj.dao.EmployeeDAOImpl;
import com.bankingapi.devaraj.model.Customer;
import com.bankingapi.devaraj.model.CustomerAccountDetails;
import com.bankingapi.devaraj.model.Employee;

public class EmployeeService {

	EmployeeDAOImpl empdao = new EmployeeDAOImpl();
	AdminDAOImpl admindao = new AdminDAOImpl();
	CustomerDAOImpl custdao = new CustomerDAOImpl();

	public boolean createEmployeeAccount(Employee employee) {
		return empdao.insertIntoEmployee(employee);
	}

	public Employee getEmployeeDetails(String username, String password) {
		return empdao.getEmployeeInformation(username, password);
	}

	public CustomerAccountDetails viewAccountInformation(int accountNumber) {
		return empdao.getAccountDetails(accountNumber);

	}

	public HashMap<Integer, Customer> listPendingApprovals() {
		List<Customer> customer = empdao.listPendingApprovals();
		HashMap<Integer, Customer> accountMap = new HashMap<Integer, Customer>();
		for (Customer csd : customer) {
			accountMap.put(csd.getCustomer_id(), csd);
		}
		return accountMap;
	}

	public void approveAccount(int customerId, String email, int ssn) {
		int existingCustomerID = empdao.getCustomerId(email, ssn);
		
		if (existingCustomerID == 0) {
			admindao.approveAcccount(customerId);
			int accountNumber = admindao.getrecentApprovedAccountNumber();
			admindao.insertToCustomerAccounttype(customerId, accountNumber);
		} 
		else {
			admindao.insertToAccountdetails(existingCustomerID);
			int accountNumber = admindao.getrecentApprovedAccountNumber();
			int accountType = admindao.getCustomerAccountType(customerId);
			admindao.insertAccountType(existingCustomerID, accountType, accountNumber);
			custdao.deleteCustomerfromPendingApproval(customerId);
		}
	}

	public void denyApprovals(int customerId) {
		custdao.deleteCustomerfromPendingApproval(customerId);
	}
}
