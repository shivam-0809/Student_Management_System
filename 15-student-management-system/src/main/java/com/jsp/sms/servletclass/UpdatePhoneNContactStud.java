package com.jsp.sms.servletclass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.sms.controller.Admin_Controller;
import com.jsp.sms.controller.Student_Controller;
import com.jsp.sms.model.Student;

@WebServlet(value = "/UpdateContAddStud")
public class UpdatePhoneNContactStud extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student_Controller StudUpdate = new Student_Controller();
		Student student = new Student();
		String StudId = req.getParameter("Id");
		int Stud_Id=Integer.parseInt(StudId);
		
		String updatePhoneNo = req.getParameter("newPhoneNumber");
		Double PhoneNo=Double.parseDouble(updatePhoneNo);
		
		String updateAddress = req.getParameter("newAdd");
		
		Student readStudentData = StudUpdate.ReadMyInfo(Stud_Id);
		if (readStudentData!=null) {
			readStudentData.setStud_Address(updateAddress);
			readStudentData.setStud_ContactNo(PhoneNo);
		} 
		
		PrintWriter printWriter = resp.getWriter();
		
		if (StudUpdate.UpdateStudentContNadd(Stud_Id, readStudentData)) {
			

			 printWriter.print("<html>");
			  printWriter.print("<style>\r\n"
			  		+ "        body {\r\n"
			  		+ "            margin: 0;\r\n"
			  		+ "            padding: 0;\r\n"
			  		+ "            background-color: gray;\r\n"
			  		+ "            font-family: Arial, sans-serif;\r\n"
			  		+ "        }\r\n"
			  		+ "\r\n"
			  		+ "        header {\r\n"
			  		+ "            background-color: #9FB1BCFF;\r\n"
			  		+ "            color: #fff;\r\n"
			  		+ "            padding: 10px;\r\n"
			  		+ "            text-align: center;\r\n"
			  		+ "        }\r\n"
			  		+ "\r\n"
			  		+ "        main {\r\n"
			  		+ "            padding: 20px;\r\n"
			  		+ "        }\r\n"
			  		+ "\r\n"
			  		+ "        footer {\r\n"
			  		+ "            background-color:#9FB1BCFF;\r\n"
			  		+ "            color: #fff;\r\n"
			  		+ "            text-align: center;\r\n"
			  		+ "            padding: 10px;\r\n"
			  		+ "            position: fixed;\r\n"
			  		+ "            bottom: 0;\r\n"
			  		+ "            width: 100%;\r\n"
			  		+ "        }\r\n"
			  		+ "    </style>");
			  printWriter.print("<body>");
			  printWriter.print(" <header>\r\n"
			  		+ "        <h1>Student Management System</h1>\r\n"
			  		+ "    </header>\r\n"
			  		+ "\r\n"
			  		+ "   <form action=\"Dash\" method=\"post\">\r\n"
			  		+ "    <main>\r\n"
			  		+ "        <p>Welcome to the Student Management System dashboard!</p>\r\n"
			  		+ "    </main>\r\n"
			  		+ "   </form>\r\n"
			  		+ "\r\n"
			  		+ "    <footer>\r\n"
			  		+ "        <p>&copy; 2024 Student Management System</p>\r\n"
			  		+ "    </footer>");
			printWriter.print("Student data updated successfully");
			printWriter.print("<br>");
			printWriter.print("<br>");

			printWriter.print("<p><b>Address:</b> " + readStudentData.getStud_Address() + "</p>");
			printWriter.print("<p><b>Contact:</b> " + readStudentData.getStud_ContactNo() + "</p>");
			printWriter.print("<br>");
			printWriter.print("<br>");



			printWriter.print("<a href=\"StudPage.html\"><button>Back to Home</button></a>\r\n"
					);
			  printWriter.print("</body></html>");
		} else {
			printWriter.print("Failed to update student data. Please check the provided student ID.");

		}

		
	}

}
