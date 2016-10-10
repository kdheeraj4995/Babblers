<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div data-ng-controller="IndividualBlog">
	<div style="margin-top: 20px;border: 5px;border-color: blue">
		<c:if test="${!empty blogList}">
			<c:forEach items="${blogList}" var="blog">
				<div  hidden="true">
					<p style="padding: 10px; font-size: large">
						<input type="number" value="${blog.bid}" id="bid">
					</p>
				</div>
				<div style="background-color: lightgrey">
					<p style="padding: 10px; font-size: large;">
						<strong>${blog.blogName}</strong>
					</p>
				</div>
				<div style="background-color: lightgrey">
					<p style="padding: 10px; font-size: medium">${blog.blogDesc}</p>
				</div>
			</c:forEach>
		</c:if>
		
	</div>
	<c:if test="${!empty blogRating}">
			<c:forEach items="${blogRating}" var="rating">
				<div  hidden="true">
					<p style="padding: 10px; font-size: large">
						<input type="number" value="${rating.brating}" >
					</p>
				</div>
				
			</c:forEach>
		</c:if>
	<select data-ng-model="blograting" data-ng-options="x for x in rating"></select>
	{{blograting}}
	<input type="text" value="${sessionScope.userid}" style="margin-top: 75px" id="userid" hidden="true" />
	<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/IndividualBlog.js"></script>
	

</div>