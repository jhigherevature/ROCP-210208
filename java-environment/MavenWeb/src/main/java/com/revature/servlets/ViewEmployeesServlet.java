package com.revature.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.joseph.connectionutil.ConnectionUtility;
import com.revature.joseph.dao.EmployeeDAO;
import com.revature.joseph.model.Employee;

@SuppressWarnings("serial")
/*
 * The @WebServlet annotation is a quick way to establish a servlet and map it.
 * The Web Container will scan your project for servlets that have certain
 * annotations, and will configure and map these servlets for you.
 * 
 * Although this annotation is quick and convenient, we lose some
 * customizability when using it.
 */
@WebServlet("/viewEmployees")
public class ViewEmployeesServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmployeeDAO eDao = ConnectionUtility.getEmployeeDAO();
		List<Employee> employees = eDao.selectAllEmployees();

		request.setAttribute("employees", employees);
		request.getRequestDispatcher("viewEmployees.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
