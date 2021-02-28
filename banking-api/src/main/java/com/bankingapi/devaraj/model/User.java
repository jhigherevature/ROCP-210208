package com.bankingapi.devaraj.model;

public class User {
	
	private int user_id;
	private String user_role;
	
	public User() {}

	public User(int user_id, String user_role) {
		super();
		this.user_id = user_id;
		this.user_role = user_role;
	}
	
	public User(String user_role) {
		super();
		this.user_role = user_role;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_role=" + user_role + "]";
	}
}
