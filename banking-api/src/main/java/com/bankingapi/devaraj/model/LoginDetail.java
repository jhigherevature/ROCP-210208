package com.bankingapi.devaraj.model;

public class LoginDetail {

	private int login_details_id;
	private String login_user_name;
	private String login_password;
	private int user_role;

	public LoginDetail() {
	}

	public LoginDetail(int login_details_id, String login_user_name, String login_password, int user_role) {
		super();
		this.login_details_id = login_details_id;
		this.login_user_name = login_user_name;
		this.login_password = login_password;
		this.user_role = user_role;
	}

	public LoginDetail(String login_user_name, String login_password, int user_role) {
		super();
		this.login_user_name = login_user_name;
		this.login_password = login_password;
		this.user_role = user_role;
	}

	public LoginDetail(int login_details_id) {
		super();
		this.login_details_id = login_details_id;
	}

	public int getLogin_details_id() {
		return login_details_id;
	}

	public void setLogin_details_id(int login_details_id) {
		this.login_details_id = login_details_id;
	}

	public String getLogin_user_name() {
		return login_user_name;
	}

	public void setLogin_user_name(String login_user_name) {
		this.login_user_name = login_user_name;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}

	public int getUser_role() {
		return user_role;
	}

	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}

	@Override
	public String toString() {
		return "LoginDetails [login_details_id=" + login_details_id + ", login_user_name=" + login_user_name
				+ ", login_password=" + login_password + ", user_role=" + user_role + "]";
	}
}
