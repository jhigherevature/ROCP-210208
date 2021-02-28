package com.bankingapi.devaraj.dao;

import java.util.List;

import com.bankingapi.devaraj.model.AccountType;
import com.bankingapi.devaraj.model.CustomerAccountType;

public interface AccountTypeDAO {
	
	public boolean createAccountType(AccountType acctType);
	public List<AccountType> listAllAccountType();
	public boolean removeAccountType(int id);
	public boolean insertCustomerAccountType(CustomerAccountType customerAccount);

}
