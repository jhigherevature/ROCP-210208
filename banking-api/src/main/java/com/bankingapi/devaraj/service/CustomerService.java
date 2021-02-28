package com.bankingapi.devaraj.service;

import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bankingapi.devaraj.dao.AccountTypeDAOImpl;
import com.bankingapi.devaraj.dao.CustomerDAOImpl;
import com.bankingapi.devaraj.dao.UserDAOImpl;
import com.bankingapi.devaraj.model.Customer;
import com.bankingapi.devaraj.model.CustomerAccountDetails;
import com.bankingapi.devaraj.model.CustomerAccountType;

public class CustomerService {

	public static Logger log = LogManager.getLogger(UserDAOImpl.class);

	CustomerDAOImpl customerdao = new CustomerDAOImpl();
	AccountTypeDAOImpl acctType = new AccountTypeDAOImpl();

	public boolean createCustomerAccount(Customer customer) {
		return customerdao.createCustomerAccount(customer);
	}

	public int getCustomerId(String email, int ssn) {
		return customerdao.getCustomerId(email, ssn);
	}

	public boolean insertCustomerAccountType(CustomerAccountType customerAccount) {
		return acctType.insertCustomerAccountType(customerAccount);
	}

	public HashMap<String, CustomerAccountDetails> getAccountDetail(String username, String password) {

		List<CustomerAccountDetails> csDetail = customerdao.getCustomerAccountsDetails(username, password);
		HashMap<String, CustomerAccountDetails> accountMap = new HashMap<String, CustomerAccountDetails>();
		for (CustomerAccountDetails csd : csDetail) {
			accountMap.put(csd.getCustomer_account_Type(), csd);
		}
		return accountMap;
	}

	public CustomerAccountDetails getCustomerAccountInfo(String userName, String password, int accountNumber) {
		return customerdao.getCustomerAccountInfo(userName, password, accountNumber);
	}

	public void depositToAccount(String userName, String password, int accountNumber, double depositedAmount) {
		CustomerAccountDetails csdetail = getCustomerAccountInfo(userName, password, accountNumber);
		double current_balance = csdetail.getCustomer_balance();
		double updated_balance = current_balance + depositedAmount;
		customerdao.depositWithdrawUpdate(userName, password, accountNumber, updated_balance);
	}

	public void withDrawFromAccount(String userName, String password, int accountNumber, double AmountToWithdraw) {
		CustomerAccountDetails csdetail = getCustomerAccountInfo(userName, password, accountNumber);
		double updated_balance = 0;
		double current_balance = csdetail.getCustomer_balance();
		if (current_balance >= AmountToWithdraw) {
			updated_balance = current_balance - AmountToWithdraw;
			customerdao.depositWithdrawUpdate(userName, password, accountNumber, updated_balance);
		} else {
			System.out.println("You can not withdraw more than " + current_balance);
		}
	}

	public void transferFund(String userName, String password, int sourceAccountNumber, int targetAccountNumber,
			double amountToTransfer) {

		CustomerAccountDetails csdetail = getCustomerAccountInfo(userName, password, sourceAccountNumber);
		double source_ac_current_balance = csdetail.getCustomer_balance();
		double target_account_current_balance = customerdao.getBalanceByAccountNumber(targetAccountNumber);
		double source_ac_updated_balance = 0, target_ac_updated_balance = 0;

		if (source_ac_current_balance >= amountToTransfer) {
			source_ac_updated_balance = source_ac_current_balance - amountToTransfer;
			target_ac_updated_balance = target_account_current_balance + amountToTransfer;
			customerdao.updateAccountBalanceByAccountNumber(targetAccountNumber, target_ac_updated_balance);
			customerdao.depositWithdrawUpdate(userName, password, sourceAccountNumber, source_ac_updated_balance);
		} else {
			System.out.println("You can not transfer more than " + source_ac_current_balance);
		}
	}
}
