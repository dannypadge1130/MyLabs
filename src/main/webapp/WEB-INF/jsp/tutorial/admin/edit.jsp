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
  
		<form>
            <textarea name="editor1" id="editor1" rows="10" cols="50">
                {{entry.body}}
            </textarea>
            <script>
                // Replace the <textarea id="editor1"> with a CKEditor
                // instance, using default configuration.
                CKEDITOR.replace( 'editor1' );
            </script>
        </form>
	
  </body>
</html>