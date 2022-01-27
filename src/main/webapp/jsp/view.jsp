<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ page import="com.student.*" %>
	<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%List<Student> st=(List<Student>) request.getAttribute("list"); %>
	<table>
		<tr>
			<th>Student No.</th>
			<th>Student Name</th>
			<th>Subject</th>
		</tr>
		<% for (Student st1: st) {%>
		
			<tr>
				<td><%=st1.getStudentNo() %></td>
				<td><%=st1.getStudentName() %></td>
				<td><%=st1.getSubject() %></td>
			</tr>
		<%}%>
		
	</table>
</body>
</html>