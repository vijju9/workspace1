package ContextParServlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException{
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//using 2nd way to create Context object
		ServletContext context = getServletContext();
		
		String s1 = context.getInitParameter("vijetha");
		String s2 = context.getInitParameter("rao");
		
		out.println("param1 value is " + s1 + " and param2 value is " + s2);
		
		out.close();
		
		
	}
}
