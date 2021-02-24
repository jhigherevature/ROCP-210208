package com.bankingapi.devaraj.dao;

import com.bankingapi.devaraj.models.Customer;
import com.bankingapi.devaraj.models.Employee;

public interface LoginDAO {
	
	public Employee getEmployeeByLogin(String name, String pass);
	public Customer getCustomerLogin(String name, String pass);
	public boolean createEmployeeLogin(String name, String pass);
	public boolean creteCustomerLogin(String name, String pass);
}
