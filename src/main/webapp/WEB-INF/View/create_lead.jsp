<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Create</title>
</head>
<body>
<h2>Lead Page</h2>
<form action="saveLeadData" method="post">
<pre>
First Name: <input type="text" name="firstName"/>
Last Name: <input type="text" name="lastName"/>
Email Id: <input type="text" name="email"/>
Lead Source: <select name="leadSource">
  				<option value="Tv Ads">Tv Ads</option>
				<option value="Social Media">Social Media</option>
				<option value="News Paper">News Paper</option>
				<option value="Internet Browsing">Internet Browsing</option>
			</select>
Mobile No: <input type="text" name="mobile"/>
<input type="submit" value="Submit"/>
</pre>
</form>
</body>
</html>