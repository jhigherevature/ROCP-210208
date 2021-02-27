package com.bankapi.devaraj.Application;

import java.util.List;

import com.bankapi.devaraj.dao.AccountTypeDAO;
import com.bankapi.devaraj.dao.AccountTypeDAOImpl;
import com.bankapi.devaraj.dao.AdminDAOImpl;
import com.bankapi.devaraj.dao.CustomerDAOImpl;
import com.bankapi.devaraj.dao.LoginDAOImpl;
import com.bankapi.devaraj.dao.UserDAOImpl;
import com.bankapi.devaraj.model.AccountType;
import com.bankapi.devaraj.model.Customer;
import com.bankapi.devaraj.model.LoginDetail;
import com.bankapi.devaraj.model.User;

public class Simulator {

	public static void main(String[] args) {
		
		UserDAOImpl userdao = new UserDAOImpl();
		
		User user = new User("Employee");
		User user2 = new User("Customer");

		
		userdao.createUser(user);
		userdao.createUser(user2);
		/*
		List<User> us = userdao.listAllUser();
		for(User usr : us) {
			System.out.println("user ============================================="+usr);
		}
		
	//	userdao.removeUser(1);
		
		AccountTypeDAO acctType = new AccountTypeDAOImpl();
		acctType.createAccountType(new AccountType("checking"));
		List<AccountType> acct = acctType.listAllAccountType();
		for(AccountType accts: acct) {
			System.out.println(accts);
		}
		//acctType.removeAccountType(1);

	*/
		LoginDAOImpl login = new LoginDAOImpl();
//		login.createLogin(new LoginDetail("dacharya", "Dev@1234", 1));
//		System.out.println(login.getLoginid("dacharya", "Dev@1234"));
//		
		CustomerDAOImpl customer = new CustomerDAOImpl();
		int loginid = login.getLoginid("dacharya", "Dev@1234");
		customer.createCustomerAccount(new Customer("devaraj", "acharyay", "9722519902", 1235645891, "dev.paaudel@gmail.com", 
				"3143 w walnut hill lane", "irving", "tx", 75038, "usa", loginid));
		
		AdminDAOImpl admin = new AdminDAOImpl();
		admin.approveAcccount(6);
	}

}
