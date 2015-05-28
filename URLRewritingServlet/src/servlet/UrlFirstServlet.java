package servlet;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class UrlFirstServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException{
		
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("userName");
			out.print("Welcome " + name);
			
			//appending the username in the query string
			out.print("<a href='myServlet2?uname="+ name +"'> visit</a>");
			out.close();
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}
}
