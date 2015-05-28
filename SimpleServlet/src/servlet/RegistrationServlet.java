package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;
public class RegistrationServlet extends HttpServlet  {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		
		response.setContentType("text/html");
		String UserName = request.getParameter("uname");
		String Password = request.getParameter("password");
		
		if(UserName.equals("Sri") && Password.equals("priya")){
			response.sendRedirect("Welcome.html");
		}
		else
		{
			response.sendRedirect("RegistrationForm.html");
		}
		
	}

}
