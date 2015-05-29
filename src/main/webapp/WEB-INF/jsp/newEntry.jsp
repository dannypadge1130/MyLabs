<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width" />
		
		<jsp:include page="includes/globalcss.jsp"></jsp:include>
		
		<title>Create New Entry</title>
	</head>
	<body>
		<jsp:include page="includes/header.jsp"></jsp:include>	

		<div class="container">
			<div class="row">
				<div class="col-xs-10 col-md-8 col-md-offset-2">
					<span class="new-entry-options">
						<a href='<c:url value="/blog/admin/create"/>' class="btn btn-lg btn-success"><span class="glyphicon glyphicon-comment"></span> Blog Entry</a>
						<a href='<c:url value="/lab/admin/create"/>' class="btn btn-lg btn-warning"><span class="glyphicon glyphicon-filter"></span> Lab Entry</a>
						<a href='<c:url value="/tutorial/admin/create"/>' class="btn btn-lg btn-info"><span class="glyphicon glyphicon-pencil"></span> Tutorial Entry</a>
					</span>
				</div>
			</div>
		</div>

		<jsp:include page="includes/footer.jsp"></jsp:include>	
	
		<jsp:include page="includes/globaljs.jsp"></jsp:include>	
	
	</body>
</html>