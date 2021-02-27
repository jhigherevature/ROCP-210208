package com.bankapi.devaraj.dao;

import com.bankapi.devaraj.model.LoginDetail;

public interface LoginDAO {
	
	public boolean createLogin(LoginDetail login);
	public int getLoginid(String user, String password);
	public boolean getCustomerLogin(String usereName, String Password);

}
