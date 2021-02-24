package com.bankingapi.devaraj.models;

public class AccountDetails {
	
	private int account_number;
	private int account_customer;
	private int account_type;
	private double account_balance;
	
	public AccountDetails() {}

	public AccountDetails(int account_number, int account_customer, int account_type, double account_balance) {
		super();
		this.account_number = account_number;
		this.account_customer = account_customer;
		this.account_type = account_type;
		this.account_balance = account_balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public int getAccount_customer() {
		return account_customer;
	}

	public void setAccount_customer(int account_customer) {
		this.account_customer = account_customer;
	}

	public int getAccount_type() {
		return account_type;
	}

	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}

}
