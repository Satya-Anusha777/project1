package com.web;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet  extends GenericServlet{
    public void init(){
    	System.out.println("init is called");
    }
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body bgcolor = red text = yellow>");
		out.print("<h1><center>Welcome to Servlet</center></h1>");
		out.print("</body>");
		out.print("<html>");
		
	}

}
