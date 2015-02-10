<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" ng-app="app" ng-controller="BlogController" ng-init="init('<c:out value='${id}'/>')">

	<head>	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   		<meta name="viewport" content="width=device-width" />
   	
		<jsp:include page="includes/globalcss.jsp"></jsp:include>
		<jsp:include page="includes/globaljs.jsp"></jsp:include>	
		
		<title>{{entry.title}}</title>
	</head>
	<body>
	
		<!-- Fixed navbar -->
		<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		  <div class="container">
		    <div class="navbar-header">
		      <a href='<c:url value="/"/>' class="btn btn-primary return"><span class="glyphicon glyphicon-arrow-left"></span> Return</a>
		    </div>
		  </div>
		</div>
		
		<div class="container">
			<div class="row">
				<div class="col-lg-2"></div>
				<div class="col-lg-8">	
					<img width="600px" height="150px" src="https://prerender.io/img/angularjs.jpg" alt="{{entry.title}}"/>
					<h1>{{entry.title}}</h1>
					
					<!-- Author -->
					<div ng-if="entry.createdDate == entry.modifiedDate">
						 <p class="lead">by Dan Padgett - <em>Posted on {{entry.createdDate | date:"medium"}}</em></p>
					</div>
					<div ng-if="entry.createdDate != entry.modifiedDate">
						<p class="lead">by Dan Padgett - <em>Edited on {{entry.modifiedDate | date:"medium"}}</em></p>
					</div>		
		            
		            <hr>
		            <div ng-bind-html="entry.body"></div>
		            <hr>
	            </div>
	            <div class="col-lg-2"></div>
	    	</div>
		</div>
		
		<jsp:include page="includes/footer.jsp"></jsp:include>
		
	</body>
</html>