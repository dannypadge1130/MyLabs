<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<jsp:include page="includes/globalcss.jsp"></jsp:include>

<jsp:include page="includes/globaljs.jsp"></jsp:include>
	
<script type="text/javascript" src="resources/js/blog.js"></script>

<title>Dan Padgett - Labs</title>
</head>
	<body ng-app="blogViewer">
	
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
	      <a class="navbar-brand">My Labs</a>
	    </div>
	    <div class="navbar-collapse collapse">
	      <ul class="nav navbar-nav">
	        <li class="active"><a href='<c:url value="/"/>'>Home</a></li>
	        <li><a href='<c:url value="/about"/>'>About</a></li>
	      </ul>
	    </div><!--/.nav-collapse -->
	  </div>
	</div>
	
	<div class="container" ng-controller="BlogController">
		<div ng-repeat="entry in blogentries">
			<div class="page-header">
				<b>{{entry.title}}</b> - <em>{{entry.createdDate | date:"mediumDate"}}</em>
			</div>
			<ng-include src="entry.path"></ng-include>
		</div>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>
			
	<script type="text/javascript">
		(function(jQuery){
		  jQuery( document ).ready( function() {
		    prettyPrint();
		  } );
		}(jQuery))
	</script>
	</body>
</html>