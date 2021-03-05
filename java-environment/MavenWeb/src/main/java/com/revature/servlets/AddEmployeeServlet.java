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
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("emp_name");
		Double salary = Double.parseDouble(request.getParameter("emp_salary"));
		String title = request.getParameter("emp_title");
		
		EmployeeDAO eDao = ConnectionUtility.getEmployeeDAO();
			
		Employee emp = new Employee(null, name, salary, title);
		eDao.insertIntoEmployees(emp);
		
		List<Employee> employees = eDao.selectAllEmployees();
		
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("viewEmployees.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
