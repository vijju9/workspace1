package RequestDispatcher;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	  				throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String UserName = request.getParameter("username");
		out.print("Welcome " + UserName);
		out.close();
	}

}
