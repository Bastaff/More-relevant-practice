package com.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.webapp.beans.UserAccount;
import com.webapp.utils.MyUtils;

@WebServlet(urlPatterns = {"/userInfo"})
public class UserInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public UserInfoServlet() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		UserAccount loggedInUser = MyUtils.getLoggedInUser(session);

		if (loggedInUser == null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return;
		}

		request.setAttribute("user", loggedInUser);

		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/views/userInfoView.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
