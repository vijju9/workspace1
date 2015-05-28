package servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
public class GenericServlet1 extends GenericServlet{

	
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<b>This is Simple Generic Servlet...<b>");
		out.println("</html></body>");
		out.close();
		
	}
	

}
