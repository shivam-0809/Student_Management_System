
package com.jsp.sms.servletclass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.sms.controller.Admin_Controller;
import com.jsp.sms.model.Student;

@WebServlet(value = "/AddStud")
public class AddStud_Admin extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Student_name = req.getParameter("name");
		String Contact_No = req.getParameter("contactNo");
		long contact = Long.parseLong(Contact_No);
		String Address = req.getParameter("address");
		String Branch = req.getParameter("branch");
		String Gender = req.getParameter("gender");
		String Email = req.getParameter("email");
		String Password = req.getParameter("password");
		System.out.println(contact);

		Student student = new Student();
		student.setStud_name(Student_name);
		student.setStud_ContactNo(contact);
		student.setStud_Address(Address);
		student.setStud_Branch(Branch);
		student.setStudent_gender(false);
		student.setEmail(Email);
		student.setStud_Pass(contact);
		PrintWriter printWriter = resp.getWriter();
		
		Admin_Controller adminController = new  Admin_Controller();
		if(Student_name!=null&& contact!=0 &&Address!=null&&Branch!=null&&Gender!=null&&Email!=null&&Password!=null) {
		
		}
      if (adminController.addStud(student)) {
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
    	  printWriter.print("Successfully added data");
    	  printWriter.print("<br>");
    	  printWriter.print("<br>");
    	  printWriter.print("<p><b>Name:</b> " + student.getStud_name() + "</p>");
			printWriter.print("<p><b>Stud_Branch:</b> " + student.getStud_Branch() + "</p>");
			printWriter.print("<p><b>Address:</b> " + student.getStud_Address() + "</p>");
			printWriter.print("<p><b>Contact:</b> " + student.getStud_ContactNo() + "</p>");
			printWriter.print("<p><b>Email:</b> " + student.getEmail() + "</p>");
			printWriter.print("<p><b>Password:</b> " + student.getStud_Pass() + "</p>");
			

    	  printWriter.print("<a href=\"AdminPage.html\"><button>Back to Home</button></a>\r\n"
					);

		  printWriter.print("</body></html>");

      } else {
    	  printWriter.print("Unsuccessful");
      }
		
       
        

	}

}


