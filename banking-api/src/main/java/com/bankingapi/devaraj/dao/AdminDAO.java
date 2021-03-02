package com.bankingapi.devaraj.dao;

public interface AdminDAO {
	
	public boolean approveAcccount(int customer_id);
//	public boolean denyAccount(int customer_id);
//	public boolean updateCustomerAccount(int customer_id);
	
	public int getrecentApprovedAccountNumber();
	public boolean insertToCustomerAccounttype(int customer_id, int accountNumber);
	public boolean insertToAccountdetails(int customerId);
	public boolean insertAccountType(int customerId, int accountType, int accountNumber);
	public boolean depositWithdrawupdate(int accountNumber, double amount);
}
