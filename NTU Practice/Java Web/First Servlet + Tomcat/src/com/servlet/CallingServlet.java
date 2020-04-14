package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sq")
public class CallingServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int k = 0;
		Cookie cookies[] = req.getCookies();

		for (Cookie c : cookies) {

			if (c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}

		k = k * k;

		PrintWriter out = res.getWriter();
		out.println("The square is " + k);

		// Adding contents of index.html so we can add 2 numbers after result is shown
		res.setContentType("text/html");
		RequestDispatcher rd = req.getRequestDispatcher("/index.html");
		rd.include(req, res);
	}

}
