<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
  
  	<jsp:include page="../includes/globalcss.jsp"></jsp:include>
	<jsp:include page="../includes/globaljs.jsp"></jsp:include>
  
	<script src="//cdn.ckeditor.com/4.4.7/standard/ckeditor.js"></script>
	
   	<title>Edit</title>
  </head>
  <body>
		TESTING
		<form>
            <textarea name="editor1" id="editor1" rows="10" cols="80">
                This is my textarea to be replaced with CKEditor.
            </textarea>
            <script>
                // Replace the <textarea id="editor1"> with a CKEditor
                // instance, using default configuration.
                CKEDITOR.replace( 'editor1' );
            </script>
        </form>
	
  </body>
</html>