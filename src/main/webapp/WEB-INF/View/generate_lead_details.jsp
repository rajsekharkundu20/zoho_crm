<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Lead Generate Page</h2>
<form action="generate" method="post">
<pre>
First Name: <input type="text" name="firstName" value="${generateLeadData.firstName}"/>
Last Name: <input type="text" name="lastName" value="${generateLeadData.lastName}"/>
Email Id: <input type="text" name="email" value="${generateLeadData.email}"/>
Mobile No: <input type="text" name="mobile" value="${generateLeadData.mobile}"/>
Product Name: <input type="text" name="productName"/>
Amount: <input type="text" name="amount"/>
<input type="submit" value="Generate Detail"/>
</pre>
</form>
</body>
</html>