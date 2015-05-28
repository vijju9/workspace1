<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Controller Page</title>
</head>
<body>
<%
String selectPage = request.getParameter("page");

if(selectPage.equals("web")){
	response.sendRedirect("web.jsp");
}
if(selectPage.equals("java")){
	response.sendRedirect("java.jsp");
}
%>

</body>
</html>