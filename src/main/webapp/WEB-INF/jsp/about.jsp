<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   	<meta name="viewport" content="width=device-width" />
   	
   	<title>About - Dan Padgett</title>

	<jsp:include page="includes/globalcss.jsp"></jsp:include>

  </head>
  <body class="about">
		
	<jsp:include page="includes/header.jsp"></jsp:include>	

	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<div class="about-profile-picture">
					<img src="<c:url value='/resources/images/blog-profile-pic.jpg'/>" />
				</div>
			</div>
			<div class="col-lg-7 entry">
				<div class="page-header">ABOUT</div>
					
				<div class="about">
					<p>My name is Dan Padgett.  I am a web application developer located in NYC (The Big Apple).  
					I decided to start this site to help track my ideas and personal work.  I broke this site 
					down into three sections, articles and blog entries, tutorials, and most importantly different 
					personal projects I decide to work on.  I will call these personal projects labs.</p>
				</div>	
				
				<div>	
					<strong>Blog</strong>
					<p>The idea of this blog is to track my train of thought as I discover new technologies, 
					and solve different problems.</p>
				</div>
						
				<div>
					<strong>Tutorials</strong>
					<p>For future reference and contribution to the Web, I plan on creating tutorials for 
					different problems I have encountered and the steps I took in resolving them.</p>
				</div>
						
				<div>
					<strong>Labs</strong>
					<p>In this section I will provide information regarding different personal projects 
					I am working on or have worked on. These can be small or very large applications.  
					I plan on providing source code for all these.</p>
				</div>
				
				<div>
					<em>The tech stack for this site is SpringMVC, AngularJS, JQuery, Bootstrap, MongoDB</em>
				</div>
				<hr>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>

	<jsp:include page="includes/footer.jsp"></jsp:include>
		
	<jsp:include page="includes/globaljs.jsp"></jsp:include>	
		
	</body>
</html>