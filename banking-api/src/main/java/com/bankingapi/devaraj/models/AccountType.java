package com.bankingapi.devaraj.models;

public class AccountType {
		
	private int account_id;
	private String account_type;
	
	public AccountType() {}

	public AccountType(int account_id, String account_type) {
		super();
		this.account_id = account_id;
		this.account_type = account_type;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
}
