<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.navbar-inner {
    background-color:transparent;
}
</style>
</head>
<body>

<!-- Navigation bar Common to all pages -->
<nav class="navbar navbar-default navbar-fixed-top">
	<div class="navbar-inner">
			<div class="container-fluid">
				<div class="navbar-header">
					<a class="navbar-brand" href="#">Babblers</a>
				</div>
				<ul class="nav navbar-nav">
					<li><a href="#">Forum</a></li>
				</ul>
				<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="" ><span
							class="glyphicon glyphicon-log-in"></span></a></li>
					<li><a href="#myBtn" data-toggle="modal" data-target="#myModal" ><span
							class="glyphicon glyphicon-user"></span></a></li>
				</ul>
			</div>
			</div>	
	</div>
</nav>

<!-- ModalRegistration Form -->
<div><%@include file="/WEB-INF/includes/ModalRegistration.jsp"%></div>
  
</body>
</html>