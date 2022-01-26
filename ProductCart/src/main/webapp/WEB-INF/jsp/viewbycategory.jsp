<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>	
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>

<link href="/css/style.css" rel="stylesheet">
<script src="/js/products.js"></script>


<title>List of Products by category</title>
</head>
<body>

<%@ include file="welcome.jsp" %>

	<div class="container">
		<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<form action="/viewbycate" method="post">
				<div class="form-group">
					<label for="pcategory">Select Category:</label>
					  	<select name="pcategory">
					  		<c:forEach var="cate" items="${categories}">
							  	<option value="${cate.category_id}">${cate.categoryname}</option>
						  	</c:forEach>
					  	</select>
					  	<input type="submit" class="btn btn-default" value="VieW "></input>
					</div>
				</form>
			</div>
		</div>
		
		
		<div class= "container">
			<div class="row">
				<table class="table table-bordered" >
				<tbody>
					<c:forEach var="prod" items="${product}">
						<tr>
							<td>${prod.pname}</td>
								<c:forEach var="img" items="${images}">
									<img src="/images/${img.imagename}" alt="" style="width:30%">
								</c:forEach>
						</tr>
					</c:forEach>	
					</tbody>
			</table>
			</div>
		</div> 
		
		
</body>
</html>