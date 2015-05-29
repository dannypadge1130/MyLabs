<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a href='<c:url value="/home"/>' class="navbar-brand">My Labs</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li><a ng-click="setType('*')">All</a></li>
				<li><a ng-click="setType('blog')">Blogs</a></li>
				<li><a ng-click="setType('lab')">Labs</a></li>
				<li><a ng-click="setType('tutorial')">Tutorials</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href='<c:url value="/about"/>'> About</a></li>
				<li><sec:authorize access="isFullyAuthenticated()">
						<a href='<c:url value="/admin/newEntry"/>'> New Entry</a>
					</sec:authorize></li>
				<li><sec:authorize access="isFullyAuthenticated()">
						<a href='<c:url value="/logout"/>'> Logout</a>
					</sec:authorize></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</nav>