package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HiddenFormServlet2 extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException{
		
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String name = request.getParameter("uname");
			out.print("Welcome " + name);
		}
		catch(Exception e){
			System.out.println(e);
				
			
		}
	}

}
