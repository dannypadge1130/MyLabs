<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width" />
		
		<jsp:include page="../../includes/globalcss.jsp"></jsp:include>
		
		<script type="text/javascript" src="<c:url value="/resources/ckeditor/ckeditor.js"/>"></script>
		
		<title>Create New Lab Entry</title>
	</head>
	<body ng-app="app" ng-controller="LabController" class="admin">
	
		<jsp:include page="../../includes/header.jsp"></jsp:include>	
		
		<div class="container">
			<div class="row entry">
			
				<form ng-submit="blogForm.submitLabForm()">
					<fieldset>
					
						<!-- Form Name -->
						<legend>Create Lab Entry</legend>
						
						<!-- Title input-->
						<div class="control-group">
							<label class="control-label" for="title">Title</label>
							<div class="controls">
								<input id="title" name="title" type="text" placeholder="Blog Title" class="form-control" ng-model="labForm.title" required="required">
							 </div>
						</div>
	
						<!-- LiveUrl Input-->
						<div class="control-group">
							<label class="control-label" for="liveUrl">Live URL</label>
							<div class="controls">
								<input id="liveUrl" name="liveURL" type="text" placeholder="Live URL" class="form-control" ng-model="labForm.liveURL">
							 </div>
						</div>
						
						<!-- RepoUrl Input -->
						<div class="control-group">
							<label class="control-label" for="repoUrl">Repository URL</label>
							<div class="controls">
								<input id="repoUrl" name="repoURL" type="text" placeholder="Repository URL" class="form-control" ng-model="labForm.repoURL">
							 </div>
						</div>
						
						<!-- Short Description -->
						<div class="control-group">
							<label class="control-label" for="description">Short Description</label>
						  	<div class="controls">
						    	<textarea class="form-control" id="description" name="description" required="required" ng-model="labForm.description">Short Description</textarea>
						  	</div>
						</div>
						
						<!-- Body -->
						<div class="control-group">
							<label class="control-label" for="body">Body</label>
						  	<div class="controls">
						    	<textarea name="form-control" id="body" rows="10" cols="80" required="required" ng-model="labForm.body"></textarea>
					            <script>
					                CKEDITOR.replace( 'body' );
					            </script>
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
						    	<button id="create" type="submit" name="create" class="btn btn-success">Create</button>
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