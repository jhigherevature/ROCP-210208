package com.bankingapi.devaraj.models;

public class Employee {

	private int employee_id;
	private String employee_fName;
	private String employee_lName;
	private String employee_email;
	private String employee_login_user;
	private String employee_login_password;
	private String employee_role;

	public Employee() {
	}

	public Employee(int employee_id, String employee_fName, String employee_lName, String employee_email,
			String employee_login_user, String employee_login_password, String employee_role) {
		super();
		this.employee_id = employee_id;
		this.employee_fName = employee_fName;
		this.employee_lName = employee_lName;
		this.employee_email = employee_email;
		this.employee_login_user = employee_login_user;
		this.employee_login_password = employee_login_password;
		this.employee_role = employee_role;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_fName() {
		return employee_fName;
	}

	public void setEmployee_fName(String employee_fName) {
		this.employee_fName = employee_fName;
	}

	public String getEmployee_lName() {
		return employee_lName;
	}

	public void setEmployee_lName(String employee_lName) {
		this.employee_lName = employee_lName;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public String getEmployee_login_user() {
		return employee_login_user;
	}

	public void setEmployee_login_user(String employee_login_user) {
		this.employee_login_user = employee_login_user;
	}

	public String getEmployee_login_password() {
		return employee_login_password;
	}

	public void setEmployee_login_password(String employee_login_password) {
		this.employee_login_password = employee_login_password;
	}

	public String getEmployee_role() {
		return employee_role;
	}

	public void setEmployee_role(String employee_role) {
		this.employee_role = employee_role;
	}

	@Override
	public String toString() {
		return "Employees [employee_id=" + employee_id + ", employee_fName=" + employee_fName + ", employee_lName="
				+ employee_lName + ", employee_email=" + employee_email + ", employee_login_user=" + employee_login_user
				+ ", employee_login_password=" + employee_login_password + ", employee_role=" + employee_role + "]";
	}
}
