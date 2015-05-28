package servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class UrlSecondServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException{
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			//getting value from the query string
			String myName = request.getParameter("uname");
			out.print("Hello " + myName);
			out.close();
			}
		catch(Exception e){
			System.out.println(e);
		}
	}
	

}
