<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html lang="en" ng-app="app" ng-controller="LabController" ng-init="init('<c:out value='${id}'/>')">
  <head>
  
  	<jsp:include page="../../includes/globalcss.jsp"></jsp:include>
	<jsp:include page="../../includes/globaljs.jsp"></jsp:include>
  
	<script type="text/javascript" src="<c:url value="/resources/ckeditor/ckeditor.js"/>"></script>
	
   	<title>Edit Lab {{entry.title}}</title>
  </head>
  
  <body class="admin">
		<jsp:include page="../../includes/header.jsp"></jsp:include>	
		<div class="container">
			<div class="row entry">
			
				<form ng-submit="blogForm.submitLabForm()">
					<fieldset>
					
						<!-- Form Name -->
						<legend>Edit - {{entry.title}}</legend>
						
						<!-- Text input-->
						<div class="control-group">
							<label class="control-label" for="title">Title</label>
							<div class="controls">
								<input id="title" name="title" type="text" value="{{entry.title}}" class=" form-control" ng-model="labForm.title" required="required">
							 </div>
						</div>
						
							
						<!-- LiveUrl Input-->
						<div class="control-group">
							<label class="control-label" for="liveUrl">Live URL</label>
							<div class="controls">
								<input id="liveUrl" name="liveUrl" type="text" value="{{entry.liveUrl}}" placeholder="Live URL" ng-model="labForm.liveURL" class="form-control">
							 </div>
						</div>
						
						<!-- RepoUrl Input -->
						<div class="control-group">
							<label class="control-label" for="repoUrl">Repository URL</label>
							<div class="controls">
								<input id="repoUrl" name="repoUrl" type="text" value="{{entry.repoUrl}}" placeholder="Repository URL" ng-model="labForm.repoURL" class="form-control">
							 </div>
						</div>
						
						<!-- Short Description -->
						<div class="control-group">
							<label class="control-label" for="description">Short Description</label>
						  	<div class="controls">
						    	<textarea class="form-control" id="description" name="description" ng-model="labForm.description">{{entry.description}}</textarea>
						  	</div>
						</div>
						
						<!-- Body -->
						<div class="control-group">
							<label class="control-label" for="body">Body</label>
						  	<div class="controls">
						    	<textarea name="form-control" id="body" rows="10" cols="80" ng-model="labForm.body">{{entry.body}}</textarea>
					            <script>
					                CKEDITOR.replace( 'body' );
					            </script>
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