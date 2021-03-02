package com.bankingapi.devaraj.service;

import com.bankingapi.devaraj.dao.CustomerDAOImpl;
import com.bankingapi.devaraj.dao.EmployeeDAOImpl;
import com.bankingapi.devaraj.model.CustomerAccountDetails;

public class AdminService {

	EmployeeDAOImpl empdao = new EmployeeDAOImpl();
	CustomerDAOImpl customerdao = new CustomerDAOImpl();

	public CustomerAccountDetails getCustomerDetail(int accountNumber) {
		return empdao.getAccountDetails(accountNumber);
	}

	public void withdrawFromAccount(int accountNumber, double amount) {
		CustomerAccountDetails csdetail = empdao.getAccountDetails(accountNumber);
		double current_balance = csdetail.getCustomer_balance();
		double updated_balance = 0;

		if (current_balance >= amount) {
			updated_balance = current_balance - amount;
			customerdao.updateAccountBalanceByAccountNumber(accountNumber, updated_balance);
		} else {
			System.out.println("You can not withdraw more than " + current_balance);
		}
	}

	public void depositToAccount(int accountNumber, double amount) {
		CustomerAccountDetails csdetail = empdao.getAccountDetails(accountNumber);
		double current_balance = csdetail.getCustomer_balance();
		double updated_balance = current_balance + amount;
		customerdao.updateAccountBalanceByAccountNumber(accountNumber, updated_balance);
	}
	
	public void transferFundService(int sourceAcountNumber, int targetAccountNumber, double amountToTransfer) {
		
	}
}
