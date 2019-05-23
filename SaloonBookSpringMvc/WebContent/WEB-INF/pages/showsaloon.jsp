<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
  <%@taglib prefix ="a" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="row">
		<div class="container">
			<div class="row">
				<div class="col-xs-4 col-sm-4 col-md-4"></div>

				<div class="col-xs-12 col-sm-8 col-md-4 "> 
					<h3 class="text-center text-info">Saloon Result</h3>
					<br />
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">
								<small></small>
							</h3>
						</div>
						<div>
<table border="1" width="400">
<tr>

<a:forEach var="e" items="${show}">
<td>Saloon id</td><br/>
<td>${e.id}</td><br/>
<td>Saloon name</td>
<td>${e.name}</td><br/>
<td>Saloon phoneNumber</td>
<td>${e.phoneNumber}</td><br/>
<td>${e.customerList}</td>
</a:forEach>

</tr>
</table>
</body>
</html>