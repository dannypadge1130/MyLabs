<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   	<title>Labs - Dan Padgett</title>

	<jsp:include page="includes/globalcss.jsp"></jsp:include>

	<jsp:include page="includes/globaljs.jsp"></jsp:include>

  </head>
  <body ng-app="app">

	<jsp:include page="includes/header.jsp"></jsp:include>
		
	<!-- Fixed navbar -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
	  <div class="container">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a href='<c:url value="/"/>' class="navbar-brand">My Labs</a>
	    </div>
	    <div class="navbar-collapse collapse">
	      <ul class="nav navbar-nav">
	        <li><a href='<c:url value="/"/>'>Blog</a></li>
	        <li class="active"><a href='<c:url value="/labs"/>'>Labs</a></li>
	        <li><a href='<c:url value="/tutorials"/>'>Tutorials</a></li>
	        <li><a href='<c:url value="/about"/>'>About</a></li>
	      </ul>
	    </div><!--/.nav-collapse -->
	  </div>
	</div>

	<div class="container" ng-controller="LabController">
		<div ng-repeat="lab in labs">
			<div class="page-header">
				<b>{{lab.title}}</b> - <em>{{lab.createdDate | date:"mediumDate"}}</em>
			</div>
		</div>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>
		
	</body>
</html>