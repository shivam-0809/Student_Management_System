package com.jsp.sms.servletclass;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Studentpage")

public class StudentClass extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String studentAction = req.getParameter("studentAction");

		if (studentAction != null) {
			if (studentAction.equals("StudentInfo")) {
				resp.sendRedirect("StudDataFetch.html");
			} else if (studentAction.equals("UpdatePhoneNContact")) {
				resp.sendRedirect("UpdatePhoneNContactStud.html");
			} else if (studentAction.equals("ForgotPassword")) {
				resp.sendRedirect("ForgotPassStud.html");
			} else if (studentAction.equals("Logout")) {
				resp.sendRedirect("LandingPage.html");
			} else {
				resp.sendRedirect("StudPage.html");
			}
		} else {
			resp.sendRedirect("Login.html");
		}
	}

}
