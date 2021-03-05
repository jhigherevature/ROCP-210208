package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("The doGet method was invoked!");
		String str = "This is the Test String Object! This came from the server!";
		request.setAttribute("testString", str);
		request.getRequestDispatcher("hello.jsp").forward(request, response);
	}
	
}
