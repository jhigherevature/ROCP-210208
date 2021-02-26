package com.revature.joseph.services;

import com.revature.joseph.connectionutil.ConnectionUtility;
import com.revature.joseph.dao.EmployeeDAO;
import com.revature.joseph.model.Employee;

public class EmployeeService {
	public Employee checkEmployeeInfo(Integer id) {
		EmployeeDAO eDao = ConnectionUtility.getEmployeeDAO();
		return eDao.selectEmployee(id);
	}
	
	
}
