package com.bankapi.devaraj.model;

public class AccountDetail {

	private int account_number;
	private Customer account_customer;
	private AccountType account_type;
	private double account_balance;

	public AccountDetail() {
	}

	public AccountDetail(int account_number, Customer account_customer, AccountType account_type,
			double account_balance) {
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

	public Customer getAccount_customer() {
		return account_customer;
	}

	public void setAccount_customer(Customer account_customer) {
		this.account_customer = account_customer;
	}

	public AccountType getAccount_type() {
		return account_type;
	}

	public void setAccount_type(AccountType account_type) {
		this.account_type = account_type;
	}

	public double getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}

	@Override
	public String toString() {
		return "AccountDetail [account_number=" + account_number + ", account_customer=" + account_customer
				+ ", account_type=" + account_type + ", account_balance=" + account_balance + "]";
	}
}
