<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en" ng-app="app" ng-controller="BlogController" ng-init="init('<c:out value='${id}'/>')">
  <head>
  
  	<jsp:include page="../../includes/globalcss.jsp"></jsp:include>
	<jsp:include page="../../includes/globaljs.jsp"></jsp:include>
  
	<script type="text/javascript" src="<c:url value="/resources/ckeditor/ckeditor.js"/>"></script>
	
   	<title>Edit Blog {{entry.title}}</title>
  </head>
  <body class="admin">
	
  		<jsp:include page="../../includes/header.jsp"></jsp:include>	
  
		<div class="container">
			<div class="row entry">
			
				<form ng-submit="blogForm.submitBlogForm()">
					<fieldset>
					
						<!-- Form Name -->
						<legend>Edit - {{entry.title}}</legend>
						
						<!-- Title Input-->
						<div class="control-group">
							<label class="control-label" for="title">Title</label>
							<div class="controls">
								<input id="title" name="title" type="text" class="form-control" ng-model="blogForm.title" required="required">
							 </div>
						</div>
						
						<!-- Short Description -->
						<div class="control-group">
							<label class="control-label" for="description">Short Description</label>
						  	<div class="controls">
						    	<textarea class="form-control" id="description" ng-model="blogForm.description" name="description"></textarea>
						  	</div>
						</div>
						
						<!-- Body -->
						<div class="control-group">
							<label class="control-label" for="body">Body</label>
						  	<div class="controls">
						    	<textarea name="form-control" id="body" ng-model="blogForm.body" rows="10" cols="80"></textarea>
					        </div>
						</div>
						
						<!-- BannerUrl Input-->
						<div class="control-group">
							<label class="control-label" for="bannerImageUrl">Banner Image URL</label>
							<div class="controls">
								<input id="bannerImageUrl" name="bannerImageUrl" type="text" placeholder="URL" class=" form-control" ng-model="blogForm.bannerImageUrl" required="required">
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