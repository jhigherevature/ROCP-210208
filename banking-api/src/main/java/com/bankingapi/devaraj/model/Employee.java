package com.bankingapi.devaraj.model;

public class Employee {
	
	private int employee_id;
	private String employee_fname;
	private String employee_lname;
	private String employee_email;
	private LoginDetail employee_login;
	
	public Employee() {}

	public Employee(int employee_id, String employee_fname, String employee_lname, String employee_email,
			LoginDetail employee_login) {
		super();
		this.employee_id = employee_id;
		this.employee_fname = employee_fname;
		this.employee_lname = employee_lname;
		this.employee_email = employee_email;
		this.employee_login = employee_login;
	}
	
	public Employee(String employee_fname, String employee_lname, String employee_email,
			LoginDetail employee_login) {
		super();
		this.employee_fname = employee_fname;
		this.employee_lname = employee_lname;
		this.employee_email = employee_email;
		this.employee_login = employee_login;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_fname() {
		return employee_fname;
	}

	public void setEmployee_fname(String employee_fname) {
		this.employee_fname = employee_fname;
	}

	public String getEmployee_lname() {
		return employee_lname;
	}

	public void setEmployee_lname(String employee_lname) {
		this.employee_lname = employee_lname;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public LoginDetail getEmployee_login() {
		return employee_login;
	}

	public void setEmployee_login(LoginDetail employee_login) {
		this.employee_login = employee_login;
	}

	@Override
	public String toString() {
		return "Employees [employee_id=" + employee_id + ", employee_fname=" + employee_fname + ", employee_lname="
				+ employee_lname + ", employee_email=" + employee_email + ", employee_login=" + employee_login + "]";
	}
}
