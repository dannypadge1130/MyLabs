<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en" ng-app="app" ng-controller="TutorialController" ng-init="init('<c:out value='${id}'/>')">

<head>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width" />
	
	<title>{{entry.title}}</title>
	
	<jsp:include page="../includes/globalcss.jsp"></jsp:include>
	<jsp:include page="../includes/globaljs.jsp"></jsp:include>

</head>

<body>

	<!-- Fixed navbar -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<a href='<c:url value="/home"/>' class="btn btn-primary return"><span class="glyphicon glyphicon-arrow-left"></span> Return</a>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row entry">
			<div class="col-lg-2"></div>
			<div class="col-lg-8">	
				<img width="600px" height="150px" ng-src="{{entry.bannerImageUrl}}" alt="{{entry.title}}"/>
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

	<jsp:include page="../includes/footer.jsp"></jsp:include>

</body>
</html>