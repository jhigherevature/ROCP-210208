package com.revature.joseph.dao;

import com.revature.joseph.model.Employee;

public interface LoginDAO {
	public Employee getEmployeeByLogin(String name, String pass);
}
