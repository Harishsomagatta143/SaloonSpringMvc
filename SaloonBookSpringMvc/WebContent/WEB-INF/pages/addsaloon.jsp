<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Saloon Details</h2>
<c:form action="addSaloon" method="post" modelAttribute="sal">
<table border="1" width="400">
<tr>
<td>Saloon id</td>
<td><c:input path="id" required="true"/></td>
<tr>

<tr>
<td>Saloon name</td>
<td><c:input path="name" required="true"/></td>
<tr>

<tr>
<td>Saloon phonenumber</td>
<td><c:input path="phoneNumber" required="true"/></td>
<tr>



<tr>
<td>Address id</td>
<td><c:input path="address.id" required="true"/></td>
<tr>

<tr>
<td>Address city</td>
<td><c:input path="address.city" required="true"/></td>
<tr>

<tr>
<td>Address state</td>
<td><c:input path="address.state" required="true"/></td>
<tr>

<tr>
<td>Address postalcode</td>
<td><c:input path="address.postalcode" required="true"/></td>
<%-- <tr>
 <td>Saloon id</td>
<td><c:input path="id" required="true"/></td>
<tr> --%>
 <%-- <tr>
<td>Customer id</td>
<td><c:input path="customer.id" required="true"/></td>
<tr>

<tr>
<td>Customer name</td>
<td><c:input path="customer.name" required="true"/></td>
<tr>
 
<tr>
<td>Customer emailid</td>
<td><c:input path="customer.email" required="true"/></td>
</tr>
<tr>
<td>Customer mobilenumber</td>
<td><c:input path="customer.mobileNumber" required="true"/></td>
<tr>  --%>
 

 
<tr>
<td><input type="submit" value="Add "></td>
</tr>
</table>
</c:form>
</body>
</html>