package com.bankingapi.devaraj.model;

public class CustomerAccountDetails {
	
	private int customer_id;
	private int customer_account_Numer;
	private String customer_name;
	private String customer_phone;
	private String customer_email;
	private String customer_address;
	private int customer_ssn;
	private String customer_account_Type;
	private double customer_balance;
	
	public CustomerAccountDetails() {}

	public CustomerAccountDetails(int customer_id, int customer_account_Numer, String customer_name, String customer_phone,
			String customer_email, String customer_address, int customer_ssn, String customer_account_Type,
			double customer_balance) {
		super();
		this.customer_id = customer_id;
		this.customer_account_Numer = customer_account_Numer;
		this.customer_name = customer_name;
		this.customer_phone = customer_phone;
		this.customer_email = customer_email;
		this.customer_address = customer_address;
		this.customer_ssn = customer_ssn;
		this.customer_account_Type = customer_account_Type;
		this.customer_balance = customer_balance;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getCustomer_account_Numer() {
		return customer_account_Numer;
	}

	public void setCustomer_account_Numer(int customer_account_Numer) {
		this.customer_account_Numer = customer_account_Numer;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
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

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public int getCustomer_ssn() {
		return customer_ssn;
	}

	public void setCustomer_ssn(int customer_ssn) {
		this.customer_ssn = customer_ssn;
	}

	public String getCustomer_account_Type() {
		return customer_account_Type;
	}

	public void setCustomer_account_Type(String customer_account_Type) {
		this.customer_account_Type = customer_account_Type;
	}

	public double getCustomer_balance() {
		return customer_balance;
	}

	public void setCustomer_balance(double customer_balance) {
		this.customer_balance = customer_balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customer_account_Numer;
		result = prime * result + ((customer_account_Type == null) ? 0 : customer_account_Type.hashCode());
		result = prime * result + ((customer_address == null) ? 0 : customer_address.hashCode());
		long temp;
		temp = Double.doubleToLongBits(customer_balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((customer_email == null) ? 0 : customer_email.hashCode());
		result = prime * result + customer_id;
		result = prime * result + ((customer_name == null) ? 0 : customer_name.hashCode());
		result = prime * result + ((customer_phone == null) ? 0 : customer_phone.hashCode());
		result = prime * result + customer_ssn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerAccountDetails other = (CustomerAccountDetails) obj;
		if (customer_account_Numer != other.customer_account_Numer)
			return false;
		if (customer_account_Type == null) {
			if (other.customer_account_Type != null)
				return false;
		} else if (!customer_account_Type.equals(other.customer_account_Type))
			return false;
		if (customer_address == null) {
			if (other.customer_address != null)
				return false;
		} else if (!customer_address.equals(other.customer_address))
			return false;
		if (Double.doubleToLongBits(customer_balance) != Double.doubleToLongBits(other.customer_balance))
			return false;
		if (customer_email == null) {
			if (other.customer_email != null)
				return false;
		} else if (!customer_email.equals(other.customer_email))
			return false;
		if (customer_id != other.customer_id)
			return false;
		if (customer_name == null) {
			if (other.customer_name != null)
				return false;
		} else if (!customer_name.equals(other.customer_name))
			return false;
		if (customer_phone == null) {
			if (other.customer_phone != null)
				return false;
		} else if (!customer_phone.equals(other.customer_phone))
			return false;
		if (customer_ssn != other.customer_ssn)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customer_id=" + customer_id + ", customer_account_Numer=" + customer_account_Numer
				+ ", customer_name=" + customer_name + ", customer_phone=" + customer_phone + ", customer_email="
				+ customer_email + ", customer_address=" + customer_address + ", customer_ssn=" + customer_ssn
				+ ", customer_account_Type=" + customer_account_Type + ", customer_balance=" + customer_balance + "]";
	}

}
