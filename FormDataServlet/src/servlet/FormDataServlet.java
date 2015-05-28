package servlet;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class FormDataServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
		
		response.setContentType("text/html");
		String FirstName = request.getParameter("fname");
		String LastName = request.getParameter("lname");
		PrintWriter out = response.getWriter();
		out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Reading from Form</title>");
	      out.println("<body>");
	      out.println("<h1>" + FirstName + "</h1>");
	      out.println("<h1>" + LastName + "</h1>");
	      out.println("</body>");
	      out.println("</head>");
	      out.println("</html>");
	      out.close();
	
	}

}

