<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
<head>

<meta name="viewport" content="width=device-width" />

<jsp:include page="includes/globalcss.jsp"></jsp:include>
	
<title>MyLabs - Dan Padgett</title>
</head>
	<body ng-app="app" ng-controller=EntryController>
	
	<jsp:include page="includes/globaljs.jsp"></jsp:include>	

	<!-- Fixed navbar -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
	  <div class="container">
	    <div class="navbar-header">
	      <a href='<c:url value="/home"/>' class="navbar-brand">My Labs</a>
	    </div>
	    <div class="navbar-collapse collapse">
	      <ul class="nav navbar-nav">
	      	<li><a ng-click="setType('*')">All</a></li>
	        <li><a ng-click="setType('blog')">Blogs</a></li>
	        <li><a ng-click="setType('lab')">Labs</a></li>
	        <li><a ng-click="setType('tutorial')">Tutorials</a></li>
	      </ul>
	      <div class="right">
	      	<span>
	      		<a href='<c:url value="/about"/>' class="btn btn-primary"><span class="glyphicon glyphicon-user"></span> About</a>
	      	</span>
	      	<span>
	      		<sec:authorize access="isFullyAuthenticated()">
	      			<a href='<c:url value="/logout"/>' class="btn btn-primary"><span class="glyphicon glyphicon-remove-sign"></span> Logout</a>
	      		</sec:authorize>
	      	</span>
	      </div>
	    </div><!--/.nav-collapse -->
	  </div>
	</div>
		
	<div class="container" ng-repeat="entry in entries | orderBy:createdDate"> 
  		<div class="row">
    		<div class="col-md-8 entry"> 
          		<br>
				<div class="col-md-10 col-sm-9">
             		<a ng-href='<c:url value="/"/>{{entry.type}}/view/{{entry.id}}'>
		        		<h3>{{entry.title}}</h3>
		           	</a>
	              	<div class="row">
                		<div class="col-xs-9">
		                	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate. 
			                  Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
			                  dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
			                  Aliquam in felis sit amet augue.</p>
					                  
			                <span ng-if="entry.createdDate == entry.modifiedDate">
								<em>{{entry.createdDate | date:"medium"}}</em>
							</span>
							<span ng-if="entry.createdDate != entry.modifiedDate">
								<em>edited {{entry.createdDate | date:"medium"}}</em>
							</span>
					                  
	                  		<p class="lead"><button class="btn btn-default">Read More</button></p>
						</div>
                		<div class="col-xs-3"></div>
					</div>
	              	<br><br>
				</div>
			</div>
		</div>	
	</div>
	
	<jsp:include page="includes/footer.jsp"></jsp:include>
	
	</body>
</html>