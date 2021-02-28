package com.bankingapi.devaraj.model;

public class CustomerAccountType {

	private int customer_account_id;
	private int customer_id;
	private int account_type;

	public CustomerAccountType() {
	}

	public CustomerAccountType(int customer_account_id, int customer_id, int account_type) {
		super();
		this.customer_account_id = customer_account_id;
		this.customer_id = customer_id;
		this.account_type = account_type;
	}

	public CustomerAccountType(int customer_id, int account_type) {
		super();
		this.customer_id = customer_id;
		this.account_type = account_type;
	}

	public int getCustomer_account_id() {
		return customer_account_id;
	}

	public void setCustomer_account_id(int customer_account_id) {
		this.customer_account_id = customer_account_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getAccount_type() {
		return account_type;
	}

	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}
}
