<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>

<meta name="viewport" content="width=device-width" />

<jsp:include page="includes/globalcss.jsp"></jsp:include>
	
<title>MyLabs - Dan Padgett</title>
</head>
	<body>
		<div class="container">
		
		      <div class="row">
		       
		        <div class="col-lg-12 text-center v-center">
		          
		          <h1>Hello, World!</h1>
		          <p class="lead">Welcome to MyLabs.</p>
		          
		          <br><br>
		          
		          <div class="col-lg-12 welcome-button">
		          	<a href="<c:url value='/home'/>" class="btn btn-lg btn-success">ENTER</a>
		          </div>
		        </div>
		        
		      </div> <!-- /row -->
		</div> <!-- /container full -->
	</body>
	
	<jsp:include page="includes/footer.jsp"></jsp:include>
</html>