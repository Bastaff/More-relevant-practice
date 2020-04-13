package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Calling this servlet to return the square of values in Add.java
public class CallingServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");

		int k = (int) req.getAttribute("k");

		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("The square is " + k);

		RequestDispatcher rd = req.getRequestDispatcher("/index.html");
		rd.include(req, res);
	}

}
