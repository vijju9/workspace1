package RequestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqDispatcherLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
		
		response.setContentType("text/html");
		 PrintWriter out =response.getWriter();
		 
		String UserName = request.getParameter("username");
		String Password = request.getParameter("password");
		
		if(Password.equals("servlet")){
			RequestDispatcher rd = request.getRequestDispatcher("servlet2");
			rd.forward(request, response);
		}
		else{
			out.print("Sorry UserName or Password Error!");
			RequestDispatcher rd = request.getRequestDispatcher("/RDispatcherlogin.html");
			rd.include(request, response);
		}
	}

}
