package com.karshhkr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class add extends HttpServlet {
	//req parameter and res parameter
public  void service(HttpServletRequest req,HttpServletResponse res)throws IOException {
	
	
	int num=Integer.parseInt(req.getParameter("k"));
	int sq= num*num;
	PrintWriter out=res.getWriter();
	out.print("square = "+sq);
	
	//System.out.println("Second Servlet");
//	int a =(int) req.getAttribute("k");
//	
//	// to know second servlet is call and get using res obj
//PrintWriter out=res.getWriter();
//out.print("Second Servlet"+ a);

}
}
