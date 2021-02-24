package com.bankingapi.devaraj.models;

public class Customer {

	private int customer_id;
	private String customer_fname;
	private String customer_lname;
	private String customer_phone;
	private int customer_ssn;
	private String customer_email;
	private String customer_street_address;
	private String customer_city;
	private String customer_State;
	private String customer_zipcode;
	private String customer_country;
	private int account_type;

	public Customer() {
	}

	public Customer(int customer_id, String customer_fname, String customer_lname, String customer_phone,
			int customer_ssn, String customer_email, String customer_street_address, String customer_city,
			String customer_State, String customer_zipcode, String customer_country, int account_type) {
		super();
		this.customer_id = customer_id;
		this.customer_fname = customer_fname;
		this.customer_lname = customer_lname;
		this.customer_phone = customer_phone;
		this.customer_ssn = customer_ssn;
		this.customer_email = customer_email;
		this.customer_street_address = customer_street_address;
		this.customer_city = customer_city;
		this.customer_State = customer_State;
		this.customer_zipcode = customer_zipcode;
		this.customer_country = customer_country;
		this.account_type = account_type;
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

	public int getCustomer_ssn() {
		return customer_ssn;
	}

	public void setCustomer_ssn(int customer_ssn) {
		this.customer_ssn = customer_ssn;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
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

	public String getCustomer_State() {
		return customer_State;
	}

	public void setCustomer_State(String customer_State) {
		this.customer_State = customer_State;
	}

	public String getCustomer_zipcode() {
		return customer_zipcode;
	}

	public void setCustomer_zipcode(String customer_zipcode) {
		this.customer_zipcode = customer_zipcode;
	}

	public String getCustomer_country() {
		return customer_country;
	}

	public void setCustomer_country(String customer_country) {
		this.customer_country = customer_country;
	}

	public int getAccount_type() {
		return account_type;
	}

	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_fname=" + customer_fname + ", customer_lname="
				+ customer_lname + ", customer_phone=" + customer_phone + ", customer_ssn=" + customer_ssn
				+ ", customer_email=" + customer_email + ", customer_street_address=" + customer_street_address
				+ ", customer_city=" + customer_city + ", customer_State=" + customer_State + ", customer_zipcode="
				+ customer_zipcode + ", customer_country=" + customer_country + ", account_type=" + account_type + "]";
	}
}
