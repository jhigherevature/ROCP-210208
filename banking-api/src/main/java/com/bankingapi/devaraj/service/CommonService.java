package com.bankingapi.devaraj.service;

import com.bankingapi.devaraj.dao.LoginDAOImpl;
import com.bankingapi.devaraj.dao.UserDAOImpl;
import com.bankingapi.devaraj.model.LoginDetail;

public class CommonService {
	
	LoginDAOImpl loginservice = new LoginDAOImpl();
	UserDAOImpl userdao = new UserDAOImpl();
	
	public void createLogin(LoginDetail login) {
		loginservice.createLogin(login);
	}

	public int getUserId(String user) {
		return userdao.getUserId(user);
	}

	public boolean userLogin(String userName, String password, String user) {
		
		return loginservice.getCustomerLogin(userName, password, user);
	}

	public int getLoginId(String userName, String password) {
		return loginservice.getLoginid(userName, password);
	}

}
