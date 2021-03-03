package com.revature.joseph.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.revature.joseph.connectionutil.ConnectionUtility;
import com.revature.joseph.dao.LoginDAO;
import com.revature.joseph.main.SimulatorExample;
import com.revature.joseph.model.Employee;

/*
 * Service-oriented architecture (SOA) is a design pattern wherein business
 * logic, pertaining to distinct and discrete actions, is provided by 
 * dedicated service members to other components of an application
 * 
 * SOA applies additional layers of abstraction for business activity with
 * to goal of specific outcomes.
 * 
 * Here, we have a service dedicated to logging users into our system
 */
public class AuthenticationService {
	
	public static Logger log = LogManager.getLogger(AuthenticationService.class);
	
	public static void authenticate(String name, String pass) {
		LoginDAO lDao = ConnectionUtility.getLoginDAO();
		Employee emp = lDao.getEmployeeByLogin(name, pass);
		
		if (emp!=null) {
			switch (emp.getEmp_title().toLowerCase()) {
			case "ceo":
				// CEO LOGIC
				SimulatorExample.loggedInUser = emp;
				log.debug("A CEO logged in: " + emp.getEmp_name());
				System.out.println("Was CEO");
				break;
			case "employee":
				log.debug("A Employee logged in: " + emp.getEmp_name());
				// EMPLOYEE LOGIC
				SimulatorExample.loggedInUser = emp;
				System.out.println("Was Employee");
				break;
			case "supervisor":
				log.debug("A Supervisor logged in: " + emp.getEmp_name());
				SimulatorExample.loggedInUser = emp;
				// SUPERVISOR LOGIC
				System.out.println("Was Supervisor");
				break;
			}
		} else {
			log.debug("That employee Login did not match a record in our system!");
		}
	}
}
