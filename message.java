package com.karshhkr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class message extends HttpServlet{
	//req parameter and res parameter
public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
	
	int i  = Integer.parseInt(req.getParameter("num1"));
	int j =Integer.parseInt(req.getParameter("num2"));
	int sum =i+j;
	 res.sendRedirect("add?k="+sum);
	
	
	
	
	//req.setAttribute("k", sum);
//	//request dispatcher to communicate with another servlet which is add
//	RequestDispatcher rd = req.getRequestDispatcher("add");

	//	//forward the req obj and res obj to handle by second servlet
//rd.include(req, res);
//	
	}
}