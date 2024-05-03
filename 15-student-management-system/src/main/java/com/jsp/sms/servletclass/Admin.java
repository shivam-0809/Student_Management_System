package com.jsp.sms.servletclass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Adminpage")
public class Admin extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String adminPage = req.getParameter("adminPage");
		
		 if (adminPage != null) {
	            if (adminPage.equals("DisplayAllStudents")) {
	                resp.sendRedirect("Datafetch.html");
	            } else if (adminPage.equals("AddNewStudent")) {
	                resp.sendRedirect("AddStudAdmin.html");
	            } else if (adminPage.equals("UpdateStudentData")) {
	                resp.sendRedirect("UpdateStudDataAdmin.html");
	            } else if (adminPage.equals("RemoveStudent")) {
	                resp.sendRedirect("");
	            } else if (adminPage.equals("Logout")) {
	                resp.sendRedirect("LandingPage.html");
	            } else {
	                resp.sendRedirect("AdminPage.html");
	            }
	        } else {
	            resp.sendRedirect("Login.html");
	        }
		

		
	
	}

}
