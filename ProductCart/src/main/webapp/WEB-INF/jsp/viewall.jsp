<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detailed view of products</title>
</head>
<body>
<%@ include file="welcome.jsp" %>

	<div class="container">
		<table class="table table-bordered" >
			<thead>
				<tr>
					<th>Product Code</th>
					<th>Product Name</th>
					<th>Price</th>
					<th>Availability</th>
					<th>Product Description</th>
					<th>Category</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="prod" items="${product}">
					<tr>
						<td>${prod.pcode}</td>
						<td>${prod.pname}</td>
						<td>${prod.price}</td>
						<td>${prod.status}</td>
						<td>${prod.pdescription}</td>
						<td>${prod.category.categoryname}</td>
					</tr>
				</c:forEach>	
				</tbody>
		</table>
</div>
</body>
</html>