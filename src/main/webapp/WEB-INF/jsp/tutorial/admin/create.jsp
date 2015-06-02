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
		
		<title>Create New Tutorial Entry</title>
	</head>
	<body>
		<jsp:include page="../../includes/header.jsp"></jsp:include>	

		<div class="container">
			<div class="row entry">
			
				<form class="form-horizontal">
					<fieldset>
					
						<!-- Form Name -->
						<legend>Create Tutorial Entry</legend>
						
						<!-- Title input-->
						<div class="control-group">
							<label class="control-label" for="title">Title</label>
							<div class="controls">
								<input id="title" name="title" type="text" placeholder="Blog Title" class=" form-control" required="">
							 </div>
						</div>
						
						<!-- Short Description -->
						<div class="control-group">
							<label class="control-label" for="description">Short Description</label>
						  	<div class="controls">
						    	<textarea class="form-control" id="description" name="description">Short Description</textarea>
						  	</div>
						</div>
						
						<!-- Body -->
						<div class="control-group">
							<label class="control-label" for="body">Body</label>
						  	<div class="controls">
						    	<textarea name="form-control" id="body" rows="10" cols="80"></textarea>
					            <script>
					                CKEDITOR.replace( 'body' );
					            </script>
						  	</div>
						</div>
						
						<div class="control-group">
						  	<div class="controls">
						    	<button id="create" name="create" class="btn btn-success">Create</button>
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