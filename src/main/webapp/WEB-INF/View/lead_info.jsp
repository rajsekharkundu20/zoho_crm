<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Info</title>
</head>
<body>
<h2>Lead Info</h2>
<pre>
Id: ${leadData.id}
First Name: ${leadData.firstName}
Last Name: ${leadData.lastName}
Email: ${leadData.email}
Lead Source: ${leadData.leadSource}
Mobile: ${leadData.mobile}
</pre>
<form action="composeEmail" method="post">
<input type="hidden" name="emailId" value="${leadData.email}"/>
<input type="submit" value="Email"/>
</form>
<form action="convertLead" method="post">
<input type="hidden" name="id" value="${leadData.id}"/>
<input type="submit" value="Convert"/>
</form>
</body>
</html>