<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create New Product</title>
</head>
<body>

	<%@ include file="welcome.jsp" %>
	<br>
	
	<div class="container">
		<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
			<form action="/saveproduct" method="post">
				<%-- <div class="form-group">
				  	<label for="pcategory">Product Category:</label>
					  	<select name="pcategory">
					  		<c:forEach var="cate" items="${categories}">
							  	<option value="${cate.category_id}">${cate.categoryname}</option>
						  	</c:forEach>
					  	</select>
			  	</div> --%>
			  	<div class="form-group">
				    <label for="pcategory">Product CATEGORY:</label>
				    <input type="text" name ="category" class="form-control" id="pcategory">
			  	</div>
			  	<div class="form-group">
				    <label for="productcode">Product Code:</label>
				    <input type="text" name ="pcode" class="form-control" id="pcode">
			  	</div>
			  	<div class="form-group">
				  	<label for="productname">Product Name:</label>
				  	<input type="text" name="pname" class="form-control" id="pname">
			  	</div>
			  	<div class="form-group">
				  	<label for="price">Price</label>
				  	<input type="text" name="price" class="form-control" id="price">
			  	</div>
			  	<div class="form-group">
				  	<label for="status">Status:</label>Not in Stock:
				  	<input type="radio" name="status" value="N" id="status">
				  	Available :
				  	<input type="radio" name="status" value="A" id="status">
			  	</div>
			  	<div class="form-group">
				  	<label for="pdescription">Product Description:</label>
				  	<textarea name="pdescription"></textarea>
			  	</div>
			  	<!-- <div class="form-group">
				  	<label for="pimages">Product Images:</label>
				  	<input name="pimages" type="file" id="file" multiple>
			  	</div> -->
			  	<input type="submit" class="btn btn-default" value="Save Product"></input>
			</form>
		</div>
	</div>
</body>
</html>