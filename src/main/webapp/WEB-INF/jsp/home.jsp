<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width" />
		
		<jsp:include page="includes/globalcss.jsp"></jsp:include>
		
		<title>MyLabs - Dan Padgett</title>
	</head>

	<body ng-app="app" ng-controller=EntryController>
	
		<jsp:include page="includes/header.jsp"></jsp:include>	
			
		<div class="container"> 
	  		<div class="row top-buffer" ng-repeat="entry in entries | orderBy:createdDate">
				<div class="col-xs-10 col-md-8 col-md-offset-2 entry">
	            		<a ng-href='<c:url value="/"/>{{entry.type}}/view/{{entry.id}}'>
		        		<h3>{{entry.title}}</h3>
		           	</a>
	              	<div class="row">
	               		<div class="col-xs-12">
	               			<!-- Need small description of what i'm building 300 character -->
		                	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate. 
			                  Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
			                  dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
			                  Aliquam in felis sit amet augue.</p>
					             
			                <div>
				                <span ng-if="entry.createdDate == entry.modifiedDate">
									<em>{{entry.createdDate | date:"medium"}}</em>
								</span>
								<span ng-if="entry.createdDate != entry.modifiedDate">
									<em>edited {{entry.createdDate | date:"medium"}}</em>
								</span>
					        </div>      
					        <br>   
					                  
	                  		<p class="lead"><a ng-href='<c:url value="/"/>{{entry.type}}/view/{{entry.id}}'><span class="btn btn-default">Read More</span></a></p>
						</div>
					</div>
	              	<br><br>
				</div>
			</div>	
		</div>
		
		<jsp:include page="includes/footer.jsp"></jsp:include>
		
		<jsp:include page="includes/globaljs.jsp"></jsp:include>
	
	</body>
</html>