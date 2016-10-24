<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<div data-ng-app="FindFriends" class="well">
	<h3>Find Friends</h3>
	<input data-ng-model="search" type="text" placeholder=" Search Category" class="form-control">
	<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/FindFriends.js"></script>
</div>
</html>