<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>	
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>

<link href="/css/style.css" rel="stylesheet">
<script src="/js/products.js"></script>

<title>Home</title>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<form id="menu" method="get">
 		 <div class="container-fluid">
    		<div class="navbar-header">
    			<a class="navbar-brand" href="#"></a>
    		</div>
		    <ul class="nav navbar-nav">
		      <li class="active"><a href="#">Home</a></li>
		      <li><a onclick="fncMenu('newproduct')">Add Products</a></li>
		      <li><a onclick="fncMenu('viewproductsbycategory')">List Products by category</a></li>
		      <li><a onclick="fncMenu('viewall')">Detailed Product Page</a></li>
		    </ul>
  		</div>
  </form>
</nav>
</body>
</html>