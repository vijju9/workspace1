package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SimpleServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
	                  throws ServletException, IOException{

	      res.setContentType("text/html");
	      PrintWriter out =res.getWriter();
	      out.println("<html>");
	      out.println("<head>");
	      out.println("<title>Hello</title>");
	      out.println("<body>");
	      out.println("<h1>HelloWorld</h1>");
	      out.println("</body>");
	      out.println("</head>");
	      out.println("</html>");
	      out.close();

	}
}