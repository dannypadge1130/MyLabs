<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<jsp:include page="includes/globalcss.jsp"></jsp:include>

<jsp:include page="includes/globaljs.jsp"></jsp:include>
	
<title>MyLabs - Dan Padgett</title>
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
	      <ul id="filters" class="nav navbar-nav">
	      	<li><button data-filter="*">All</button></li>
	        <li><button data-filter=".blog">Blogs</button></li>
	        <li><button data-filter=".lab">Labs</button></li>
	        <li><button data-filter=".tutorial">Tutorials</button></li>
	      </ul>
	    </div><!--/.nav-collapse -->
	  </div>
	</div>
	
	<div class="container">
	
		<div class="row">
			<div id="container" class="js-isotope" data-isotope-options='{ "itemSelector": ".item", "masonry": { "columnWidth": 200 } }'>
			  <div class="item blog"><img src="http://www.w3schools.com/angular/pic_angular.jpg"/></div>
			  <div class="item lab"><img src="http://www.w3schools.com/angular/pic_angular.jpg"/></div>
			  <div class="item blog"><img src="http://www.w3schools.com/angular/pic_angular.jpg"/></div>
			  <div class="item tutorial"><img src="http://www.w3schools.com/angular/pic_angular.jpg"/></div>
			</div>
		</div>
		
	</div>
	
	
	<!-- <div class="container" ng-controller="BlogController">
	
		<div ng-repeat="entry in blogentries | orderBy:createdDate">
		
			<div class="row">
				<div class="blog">
					
					<div class="postheader" ng-if="entry.createdDate == entry.modifiedDate">
						
						<img src="" />
						
						<b>{{entry.title}}</b> - <em>{{entry.createdDate | date:"medium"}}</em>
					</div>
					<div class="postheader" ng-if="entry.createdDate != entry.modifiedDate">
						<b>{{entry.title}}</b> - <em>edited {{entry.createdDate | date:"medium"}}</em>
					</div>
					
					<div ng-bind-html="entry.post" class="postbody"></div>	
				</div>
			</div>
			
		</div>
		
	</div> -->

	<jsp:include page="includes/footer.jsp"></jsp:include>
	
	
	<script type="text/javascript">
		
		var $container = $('#container');
		// init
		$container.isotope({
		  // options
		  itemSelector: '.item',
		  layoutMode: 'fitRows'
		});
			
		$('#filters').on( 'click', 'button', function() {
			var filterValue = $(this).attr('data-filter');
		  	$container.isotope({ filter: filterValue });
		});
	</script>
	
	</body>
</html>