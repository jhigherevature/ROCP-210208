package com.bankingapi.devaraj.models;

public class CustomerLogin {

	private int customer_login_id;
	private String customer_login_user;
	private String customer_login_password;
	private Customer customer_detail;
	private AccountDetails customer_account_detail;

	public CustomerLogin() {
	}

	public CustomerLogin(int customer_login_id, String customer_login_user, String customer_login_password,
			Customer customer_detail, AccountDetails customer_account_detail) {
		super();
		this.customer_login_id = customer_login_id;
		this.customer_login_user = customer_login_user;
		this.customer_login_password = customer_login_password;
		this.customer_detail = customer_detail;
		this.customer_account_detail = customer_account_detail;
	}

	public int getCustomer_login_id() {
		return customer_login_id;
	}

	public void setCustomer_login_id(int customer_login_id) {
		this.customer_login_id = customer_login_id;
	}

	public String getCustomer_login_user() {
		return customer_login_user;
	}

	public void setCustomer_login_user(String customer_login_user) {
		this.customer_login_user = customer_login_user;
	}

	public String getCustomer_login_password() {
		return customer_login_password;
	}

	public void setCustomer_login_password(String customer_login_password) {
		this.customer_login_password = customer_login_password;
	}

	public Customer getCustomer_detail() {
		return customer_detail;
	}

	public void setCustomer_detail(Customer customer_detail) {
		this.customer_detail = customer_detail;
	}

	public AccountDetails getCustomer_account_detail() {
		return customer_account_detail;
	}

	public void setCustomer_account_detail(AccountDetails customer_account_detail) {
		this.customer_account_detail = customer_account_detail;
	}

	@Override
	public String toString() {
		return "CustomerLogin [customer_login_id=" + customer_login_id + ", customer_login_user=" + customer_login_user
				+ ", customer_login_password=" + customer_login_password + ", customer_detail=" + customer_detail
				+ ", customer_account_detail=" + customer_account_detail + "]";
	}
}
