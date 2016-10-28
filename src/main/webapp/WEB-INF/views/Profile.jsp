<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/Profile.css"/>" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="text" value="${ViewProfile}" hidden="true" id="profileid" name="profileid">
<div class="container-fluid" style="margin-top:-50px " data-ng-controller="ViewProfile">
    <div class="fb-profile">
        <img align="left" class="fb-image-lg" src="${pageContext.request.contextPath}/resources/images/download.jpg" alt="Profile image example"/>
        <img align="left" class="fb-image-profile thumbnail" data-ng-src="data:image/JPEG;base64,{{user.image}}" alt="Profile image example"/>
        <div class="fb-profile-text">
            <h1>{{user.name}}</h1>
            <p>Status</p>
        </div>
    </div>
</div> <!-- /container -->  
<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/ViewProfile.js"></script>
</body>
</html>