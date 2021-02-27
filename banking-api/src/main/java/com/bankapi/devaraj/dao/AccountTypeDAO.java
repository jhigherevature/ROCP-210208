package com.bankapi.devaraj.dao;

import java.util.List;

import com.bankapi.devaraj.model.AccountType;
import com.bankapi.devaraj.model.CustomerAccountType;

public interface AccountTypeDAO {
	
	public boolean createAccountType(AccountType acctType);
	public List<AccountType> listAllAccountType();
	public boolean removeAccountType(int id);
	public boolean insertCustomerAccountType(CustomerAccountType customerAccount);

}
