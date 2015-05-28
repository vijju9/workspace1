package cookies;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.net.*;
import java.util.*;

public class ShoopingCart extends HttpServlet{

	public static int S_ID = 1;
	public static HashMap globalMap = new HashMap();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException{
		processRequest(request,response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException{
		processRequest(request,response);
	}
	
	public void processRequest(HttpServletRequest request, HttpServletResponse response) 
	        throws IOException, ServletException{

		HashMap sessionInfo = null;
		String SID = "";
		Cookie cookie = findCookie(request);
		if(cookie == null){
			SID = makeUniqueString();
			sessionInfo = new HashMap();
			globalMap.put(SID,sessionInfo);
			
			Cookie sessionCookie = new Cookie("JSESSIONID", SID);
			response.addCookie(sessionCookie);
		}
		else{
			sessionInfo=(HashMap)globalMap.get(cookie.getValue());
		}
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>ShoppingCartExample</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Online Book Store</h1>");
		String url = "servlet1";
		out.println("<form action="+ url +">" + 
					"<h3><input type=checkbox name = firstCB value = firstCB/>"+
					"Java Core Servlet</h3>"+"<br/>"+
					"<h3><input type = checkbox name = secondCB value = secondCB/>"+
					"Java How To Program</h3>" + "<br/>" +
					"<h3><input type = checkbox name = thirdCB value = thirdCB/>"+
					"Java Complete Referance</h3>" + "<br/>" +
					"<h3> <input type=submit value= Addtocart /> </h3>"+"</form>");
		out.println("<br/>");
		out.println("<h1> You have selected following books</h1>");
		out.println("<br/>");
		String firstBook =request.getParameter("firstCB");
		String secondBook =request.getParameter("secondCB");
		String thirdBook =request.getParameter("thirdCB");	
		
		if(firstBook != null && firstBook.equals("firstCB") ){
			sessionInfo.put("firstCB", "Java Core Servlet");
		}
		if(secondBook != null && secondBook.equals("secondCB") ){
			sessionInfo.put("secondCB", "Java How To Program");
		}
		if(thirdBook != null && thirdBook.equals("thirdCB") ){
			sessionInfo.put("thirdCB", "Java Complete Referance");
		}
		printSessionInfo(out , sessionInfo);
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	

	public String makeUniqueString() {
		
		return "ABC" + S_ID++;
	}
	public static HashMap findTableStoringSessions(){
		return globalMap;
	}
	
	public Cookie findCookie(HttpServletRequest request) {
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(int i = 0; i<cookies.length; i++){
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("JSESSIONID")){
					return cookie;
				}
			}
		}
		return null;
	}
	
	public void printSessionInfo(PrintWriter out, HashMap sessionInfo){
		String title="";
		title = (String)sessionInfo.get("firstCB");
		if(title != null){
			out.println("<h3>" + title + "</h3>");
		}
		title = (String)sessionInfo.get("secondCB");
		if(title != null){
			out.println("<h3>" + title + "</h3>");
		}
		title = (String)sessionInfo.get("thirdCB");
		if(title != null){
			out.println("<h3>" + title + "</h3>");
		}
	}


}
