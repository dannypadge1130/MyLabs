<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="en">
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   	<title>About - Dan Padgett</title>

	<jsp:include page="includes/globalcss.jsp"></jsp:include>

	<jsp:include page="includes/globaljs.jsp"></jsp:include>

  </head>
  <body>

	<jsp:include page="includes/header.jsp"></jsp:include>
		
	<!-- Fixed navbar -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
	  <div class="container">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a href='<c:url value="/"/>' class="navbar-brand">My Labs</a>
	    </div>
	    <div class="navbar-collapse collapse">
	      <ul class="nav navbar-nav">
	        <li><a href='<c:url value="/"/>'>Blog</a></li>
	        <li><a href='<c:url value="/labs"/>'>Labs</a></li>
	        <li><a href='<c:url value="/tutorials"/>'>Tutorials</a></li>
	        <li class="active"><a href='<c:url value="/about"/>'>About</a></li>
	      </ul>
	    </div><!--/.nav-collapse -->
	  </div>
	</div>

	<div class="container">
		<div class="page-header">ABOUT</div>
			
		<div class="container">
			<p>My name is Dan Padgett.  I am a web application developer located in NYC (The Big Apple).  
			I decided to start this site to help track my ideas and personal work.  I broke this site 
			down into three sections, articles and blog entries, tutorials, and most importantly different 
			personal projects I decide to work on.  I will call these personal projects labs.</p>
		</div>	
		
		<div class="container">	
			<strong>Blog</strong>
			<p>The idea of this blog is to track my train of thought as I discover new technologies, 
			and solve different problems.</p>
		</div>
				
		<div class="container">
			<strong>Tutorials</strong>
			<p>For future reference and contribution to the Web, I plan on creating tutorials for 
			different problems I have encountered and the steps I took in resolving them.</p>
		</div>
				
		<div class="container">
			<strong>Labs</strong>
			<p>In this section I will provide information regarding different personal projects 
			I am working on or have worked on. These can be small or very large applications.  
			I plan on providing source code for all these.</p>
		</div>
		
		<div style="margin-top:20px">
			<em>The tech stack for this site is SpringMVC, AngularJS, JQuery, Bootstrap, MongoDB</em>
		</div>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>
		
	</body>
</html>