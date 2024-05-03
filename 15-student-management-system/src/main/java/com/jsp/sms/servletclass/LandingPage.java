package com.jsp.sms.servletclass;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/LandingPage")
public class LandingPage extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String landingPage = req.getParameter("landingPage");

		if (landingPage!=null) {
			if (landingPage.equals("LoginAsStudent")) {
				resp.sendRedirect("Login.html");
			}else if (landingPage.equals("AdministratorPage")){
				resp.sendRedirect("AdminPage.html");

			}else {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminPage.html");
				requestDispatcher.forward(req, resp);
			}
		} 
		else {
			resp.sendRedirect("Login.html");

		}
		
	}

}

