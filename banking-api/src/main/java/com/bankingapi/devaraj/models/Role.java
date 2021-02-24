package com.bankingapi.devaraj.models;

public class Role {
	
	private int role_id;
	private int emp_role;
	
	public Role() {}

	public Role(int role_id, int emp_role) {
		super();
		this.role_id = role_id;
		this.emp_role = emp_role;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getEmp_role() {
		return emp_role;
	}

	public void setEmp_role(int emp_role) {
		this.emp_role = emp_role;
	}

}
