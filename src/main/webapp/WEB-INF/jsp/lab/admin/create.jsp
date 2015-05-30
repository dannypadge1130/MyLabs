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
	<body>
		<jsp:include page="../../includes/header.jsp"></jsp:include>	

		<div class="container">
			<h1>CREATE LAB</h1>
		</div>
		
		<jsp:include page="../../includes/footer.jsp"></jsp:include>	
	
		<jsp:include page="../../includes/globaljs.jsp"></jsp:include>	
	
	</body>
</html>