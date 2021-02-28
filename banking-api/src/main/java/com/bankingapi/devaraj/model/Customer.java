package com.bankingapi.devaraj.model;

public class Customer {

	private int customer_id;
	private String customer_fname;
	private String customer_lname;
	private String customer_phone;
	private int customer_ssn;
	private String customer_email;
	private String customer_street_address;
	private String customer_city;
	private String customer_state;
	private int customer_zipcode;
	private String customer_country;
	private int customer_account_login;

	public Customer() {
	}

	public Customer(int customer_id, String customer_fname, String customer_lname, String customer_phone,
			int customer_ssn, String customer_email, String customer_street_address, String customer_city,
			String customer_state, int customer_zipcode, String customer_country,
			int customer_account_login) {
		super();
		this.customer_id = customer_id;
		this.customer_fname = customer_fname;
		this.customer_lname = customer_lname;
		this.customer_phone = customer_phone;
		this.customer_email = customer_email;
		this.customer_ssn = customer_ssn;
		this.customer_street_address = customer_street_address;
		this.customer_city = customer_city;
		this.customer_state = customer_state;
		this.customer_zipcode = customer_zipcode;
		this.customer_country = customer_country;
		this.customer_account_login = customer_account_login;
	}
	
	public Customer(String customer_fname, String customer_lname, String customer_phone,
			int customer_ssn, String customer_email,  String customer_street_address, String customer_city,
			String customer_state, int customer_zipcode, String customer_country,
			int customer_account_login) {
		super();
		this.customer_fname = customer_fname;
		this.customer_lname = customer_lname;
		this.customer_phone = customer_phone;
		this.customer_email = customer_email;
		this.customer_ssn = customer_ssn;
		this.customer_street_address = customer_street_address;
		this.customer_city = customer_city;
		this.customer_state = customer_state;
		this.customer_zipcode = customer_zipcode;
		this.customer_country = customer_country;
		this.customer_account_login = customer_account_login;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_fname() {
		return customer_fname;
	}

	public void setCustomer_fname(String customer_fname) {
		this.customer_fname = customer_fname;
	}

	public String getCustomer_lname() {
		return customer_lname;
	}

	public void setCustomer_lname(String customer_lname) {
		this.customer_lname = customer_lname;
	}

	public String getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public int getCustomer_ssn() {
		return customer_ssn;
	}

	public void setCustomer_ssn(int customer_ssn) {
		this.customer_ssn = customer_ssn;
	}

	public String getCustomer_street_address() {
		return customer_street_address;
	}

	public void setCustomer_street_address(String customer_street_address) {
		this.customer_street_address = customer_street_address;
	}

	public String getCustomer_city() {
		return customer_city;
	}

	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}

	public String getCustomer_state() {
		return customer_state;
	}

	public void setCustomer_state(String customer_state) {
		this.customer_state = customer_state;
	}

	public int getCustomer_zipcode() {
		return customer_zipcode;
	}

	public void setCustomer_zipcode(int customer_zipcode) {
		this.customer_zipcode = customer_zipcode;
	}

	public String getCustomer_country() {
		return customer_country;
	}

	public void setCustomer_country(String customer_country) {
		this.customer_country = customer_country;
	}

	public int getCustomer_account_login() {
		return customer_account_login;
	}

	public void setCustomer_account_login(int customer_account_login) {
		this.customer_account_login = customer_account_login;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_fname=" + customer_fname + ", customer_lname="
				+ customer_lname + ", customer_phone=" + customer_phone + ", customer_email=" + customer_email
				+ ", customer_ssn=" + customer_ssn + ", customer_street_address=" + customer_street_address
				+ ", customer_city=" + customer_city + ", customer_state=" + customer_state + ", customer_zipcode="
				+ customer_zipcode + ", customer_country=" + customer_country + ", customer_account_login="
				+ customer_account_login + "]";
	}
}
