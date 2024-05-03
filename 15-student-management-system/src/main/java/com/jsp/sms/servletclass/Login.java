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


import com.jsp.sms.model.Student;

@WebServlet(value = "/Login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Username = req.getParameter("username");
		String Password = req.getParameter("password");
//		String Logout = req.getParameter("login");
//		resp.sendRedirect("Login.html");
		if (Username != null && Password!=null) {
			Student studLogin = new Student();
			PrintWriter printWriter = resp.getWriter();

				if (Username.equals(studLogin.getStud_name()) && Password.equals(studLogin.getStud_Pass())) {

					printWriter.print("<html><body>");
//					printWriter.print("<h1>-----------Login Successfully--------------</h1>");
					printWriter.print("</body></html>");
//					resp.sendRedirect("StudPage.html");
				}
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("StudPage.html");
				requestDispatcher.forward(req, resp);
				
			
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminPage.html");
			requestDispatcher.forward(req, resp);
//			System.out.println("not successfuls");
		}

		
		
		

		
	}

}
