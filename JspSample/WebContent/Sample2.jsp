<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<!--  Declaration of method -->
<%!
   int Sum( int op1, int op2){
	return op1 + op2;
}
%>
<!-- Scriptlet -->
<%
String op1 = request.getParameter("num1");
String op2 = request.getParameter("num2");
int n1 = Integer.parseInt(op1);
int n2 = Integer.parseInt(op2);
int response1 = Sum(n1,n2);
%>
<!-- Expression -->

<!--<h3>Sum of <%=" numbers is:  " + Sum(n1,n2) %> </h3>-->
<h3>Sum of <%=response1%> </h3>
</body>
</html>