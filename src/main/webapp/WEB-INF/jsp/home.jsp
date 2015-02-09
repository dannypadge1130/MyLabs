<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>

<meta name="viewport" content="width=device-width" />

<jsp:include page="includes/globalcss.jsp"></jsp:include>
	
<title>MyLabs - Dan Padgett</title>
</head>
	<body ng-app="app">
	
	<jsp:include page="includes/header.jsp"></jsp:include>
	<jsp:include page="includes/globaljs.jsp"></jsp:include>	
		
	<div ng-controller=EntryController>
		
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
		      <ul id="filters" class="nav navbar-nav">
		      	<li><button ng-click="setType('*')">All</button></li>
		        <li><button ng-click="setType('blog')">Blogs</button></li>
		        <li><button ng-click="setType('lab')">Labs</button></li>
		        <li><button ng-click="setType('tutorial')">Tutorials</button></li>
		      </ul>
		    </div><!--/.nav-collapse -->
		  </div>
		</div>
		
		<div class="container flow-container"> 
			<div ng-repeat="entry in entries | orderBy:createdDate">
				<div ng-show="type == entry.type || type == '*'" class="fadein fadeout item">
					<div class="card">
						<div class="face front">
							<img height="225px" width="275px" src="{{entry.imgUrl}}"/>
						</div>
						<div class="back face center">
							<span ng-if="entry.createdDate == entry.modifiedDate">
								<b>{{entry.title}}</b> - <em>{{entry.createdDate | date:"medium"}}</em>
							</span>
							<span ng-if="entry.createdDate != entry.modifiedDate">
								<b>{{entry.title}}</b> - <em>edited {{entry.createdDate | date:"medium"}}</em>
							</span>
						</div>
					</div>
				</div>
			</div>	
		</div>
	</div>
	
	<jsp:include page="includes/footer.jsp"></jsp:include>
	
	</body>
</html>