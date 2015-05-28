package servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class HiddenFormServlet1 extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException{
		
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("userName");
			out.print("Welcome " + name);
			//creating form that have invisible textfield
			out.println("<html>");
		      out.print("<head>");
		      out.print("<title>HiddenServlet1</title>");
		      out.print("<body>");
		      out.print("<form action='myServlet2'");
		      out.print("<input type='hidden' name='uname' value=" + name +">");
		      out.print("<input type='submit' value='go'>");
		      out.print("</body>");
		      out.print("</head>");
		      out.print("</html>");
		      out.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
