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
            		
            		<span>
	            		<a ng-href='<c:url value="/"/>{{entry.type}}/view/{{entry.id}}'>
		        			<h3>{{entry.title}}</h3>
		        		</a>
		        		<p style="float:right;">{{entry.type}}</p>
	        		</span>

              		<!-- Need small description of what i'm building 300 character -->
                	<p>{{entry.description}}</p>
			             
	                <div>
		                <span ng-if="entry.createdDate == entry.modifiedDate">
							<em>{{entry.createdDate | date:"medium"}}</em>
						</span>
						<span ng-if="entry.createdDate != entry.modifiedDate">
							<em>edited {{entry.createdDate | date:"medium"}}</em>
						</span>
			        </div>      
			        <br>   
			        
			        <div>      
                  		<a ng-href='<c:url value="/"/>{{entry.type}}/view/{{entry.id}}'><span class="btn btn-default">Read More</span></a>
                  		<sec:authorize access="isFullyAuthenticated()">
                  			<a ng-href='<c:url value="/"/>{{entry.type}}/admin/edit/{{entry.id}}'><span class="btn btn-default">Edit</span></a>
                  		</sec:authorize>
                 	</div>

	              	<br><br>
				</div>
			</div>	
		</div>
		
		<div class="container">
			<div class="row">
	         </div>
		</div>
		
		<jsp:include page="includes/footer.jsp"></jsp:include>
		
		<jsp:include page="includes/globaljs.jsp"></jsp:include>
	
	</body>
</html>