<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="en" ng-app="app" ng-controller="TutorialController" ng-init="init('<c:out value='${id}'/>')">
  <head>
  
  	<jsp:include page="../../includes/globalcss.jsp"></jsp:include>
	<jsp:include page="../../includes/globaljs.jsp"></jsp:include>
  
	<script type="text/javascript" src="<c:url value="/resources/ckeditor/ckeditor.js"/>"></script>
	
   	<title>Edit Tutorial {{entry.title}}</title>
  </head>
  <body>
  
  		<jsp:include page="../../includes/header.jsp"></jsp:include>	
  
		<div class="container">
			<div class="row entry">
			
				<form class="form-horizontal">
					<fieldset>
					
						<!-- Form Name -->
						<legend>Edit - {{entry.title}}</legend>
						
						<!-- Title Input-->
						<div class="control-group">
							<label class="control-label" for="title">Title</label>
							<div class="controls">
								<input id="title" name="title" type="text" class=" form-control" required="required" value="{{entry.title}}" ng-model="tutorialForm.title">
							 </div>
						</div>
						
						<!-- Short Description Input -->
						<div class="control-group">
							<label class="control-label" for="description">Short Description</label>
						  	<div class="controls">
						    	<textarea class="form-control" id="description" name="description" ng-model="tutorialForm.description">{{entry.description}}</textarea>
						  	</div>
						</div>
						
						<!-- Body -->
						<div class="control-group">
							<label class="control-label" for="body">Body</label>
						  	<div class="controls">
						    	<textarea name="form-control" id="body" rows="10" cols="80" ng-model="tutorialForm.body">{{entry.body}}</textarea>
					            <script>
					                CKEDITOR.replace( 'body' );
					            </script>
						  	</div>
						</div>
						
						<!-- BannerUrl Input-->
						<div class="control-group">
							<label class="control-label" for="bannerImageUrl">Banner Image URL</label>
							<div class="controls">
								<input id="bannerImageUrl" name="bannerImageUrl" type="text" placeholder="URL" class=" form-control" ng-model="blogForm.bannerImageUrl" value="{{entry.bannerImageUrl}}" required="required">
							 </div>
						</div>
						
						<div class="control-group">
						  	<div class="controls">
						    	<button id="update" type="submit" name="update" class="btn btn-success">Update</button>
						    	<button id="cancel" name="cancel" class="btn btn-danger">Cancel</button>
						  	</div>
						</div>
					
					</fieldset>
				</form>
	        </div>
		</div>
		<jsp:include page="../../includes/footer.jsp"></jsp:include>	
		<jsp:include page="../../includes/globaljs.jsp"></jsp:include>		
  </body>
</html>