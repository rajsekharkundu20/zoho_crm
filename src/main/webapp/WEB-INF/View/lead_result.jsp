<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact List</title>
</head>
<body>
<h2>Contact List</h2>
<table>
	<tr>
	<th>Id</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Email</th>
	<th>Lead Source</th>
	<th>Mobile</th>
	<th>Details</th>
	</tr>
	<c:forEach items="${leads}" var="lead">
	<tr>
	<td>${lead.id}</td>
	<td><a href="getLeadById?id=${lead.id}">${lead.firstName}</a></td>
	<td>${lead.lastName}</td>
	<td>${lead.email}</td>
	<td>${lead.leadSource}</td>
	<td>${lead.mobile}</td>
	<td><a href="generateLead?id=${lead.id}">Generate Details</a></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>