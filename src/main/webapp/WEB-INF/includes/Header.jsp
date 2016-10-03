<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<!-- Navigation bar Common to all pages -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand " style="color: white">Babblers</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="${pageContext.request.contextPath}/blog">Blog</a></li>
					<li><a href="${pageContext.request.contextPath}/forum">Forum</a></li>
					<li><a href="${pageContext.request.contextPath}/chat">Chat</a></li>
					<!-- <li><a data-toggle="tab" href="#Blog">Blog</a></li>
					<li><a data-toggle="tab" href="#Forum">Forum</a></li>
					<li><a data-toggle="tab" href="#Chat">Chat</a></li> -->
					<sec:authorize access="isAuthenticated()">
						<li><a style="color: white">Hello <b><sec:authentication
										property="principal.username" /></b></a></li>
						<li><a href="${pageContext.request.contextPath}/perform_logout"><span
								class="glyphicon glyphicon-log-out"></span></a></li>
					</sec:authorize>
					<sec:authorize access="!isAuthenticated()">
						<li><a href="#log" data-toggle="modal" data-target="#login"><span
								class="glyphicon glyphicon-log-in"></span></a></li>
						<li><a href="#reg" data-toggle="modal"
							data-target="#registration"> <span
								class="glyphicon glyphicon-user"></span>
						</a></li>
					</sec:authorize>
				</ul>
			</div>
		</div>
	</nav>


	<!-- ModalRegistration Form -->
	<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/Home.js"></script>
	<div><%@include file="/WEB-INF/includes/ModalRegistration.jsp"%></div>
	<div><%@include file="/WEB-INF/includes/ModalLogin.jsp"%></div>
</body>
</html>

