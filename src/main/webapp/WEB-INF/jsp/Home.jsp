<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en-US" data-ng-app="Myapp">
<head>

<%@include file="/WEB-INF/includes/Frameworks.jsp"%>
<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/App.js"></script>
<title>Babblers</title>
</head>
<body style="padding-top: 50px; margin-bottom: 50px">
	<header><%@include file="/WEB-INF/includes/Header.jsp"%></header>

	<div id="tabs">
		<ul>
			<li><a href="#fragment-1">Blog</a></li>
			<li><a href="#fragment-2">Forum</a></li>
			<li><a href="#fragment-3">Chat</a></li>
		</ul>
		<div id="fragment-1">
			<%@include file="/WEB-INF/jsp/Blog.jsp"%>
		</div>
		<div id="fragment-2">
			<%@include file="/WEB-INF/jsp/Forum.jsp"%>
		</div>
		<div id="fragment-3">
			<%@include file="/WEB-INF/jsp/Chat.jsp"%>
		</div>
	</div>

	<footer><%@include file="/WEB-INF/includes/Foot.jsp"%></footer>

	<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/Home.js"></script>

	<script>
		$(function() {
			$("#tabs").tabs();
		});
	</script>

	<script type="text/javascript">
		$(document).ready(function() {
			if (window.location.href.indexOf('#myModal') != -1) {
				$('#myModal').modal('show');
			}
		});
	</script>
</body>
</html>

