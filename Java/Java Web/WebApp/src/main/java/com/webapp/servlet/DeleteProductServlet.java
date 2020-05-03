package com.webapp.servlet;

import com.webapp.utils.MyUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webapp.utils.DBUtils;

@WebServlet(urlPatterns = {"/deleteProduct"})
public class DeleteProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public DeleteProductServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Connection conn = MyUtils.getStoredConnection(request);

		String code = (String) request.getParameter("code");

		String errorString = null;

		try {
			DBUtils.deleteProduct(conn, code);
		} catch (SQLException e) {
			e.printStackTrace();
			errorString = e.getMessage();
		}

		if (errorString != null) {
			request.setAttribute("errorString", errorString);

			RequestDispatcher dispatcher = request.getServletContext()
					.getRequestDispatcher(
							"/WEB-INF/views/deleteProductErrorView.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + "/productList");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
