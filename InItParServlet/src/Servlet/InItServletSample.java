package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

import javax.servlet.http.*;


public class InItServletSample extends HttpServlet {
	String filename;
	public void init(ServletConfig config){
		//super(config);
		filename = config.getInitParameter("InItParamName");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("name= " + filename);
		out.close();
	}

}
