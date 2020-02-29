<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="com.dto.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file ="HrHomePage.jsp" %>
		<h3><center>All Employee Details</center></h3>
		<% Employee emp[] = (Employee[])request.getAttribute("emp"); %>
		<table align = center border=2>
   <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Salary</th>
   </tr>
		<% 
		for(int i = 0; i < 14; i++) {
		int empId = emp[i].getEmpId();
		String empName = emp[i].getEmpName();
		double salary = emp[i].getSalary();
		%>
		<tr><td><%=empId %></td><td><%=empName %></td><td><%=salary %></td></tr>
		<% }
		%>
		</table>
		</body>
		</html>