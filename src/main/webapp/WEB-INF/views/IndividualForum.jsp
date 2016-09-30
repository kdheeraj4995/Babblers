<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div style="margin-top: 20px">
	<c:if test="${!empty forumList}">
		<c:forEach items="${forumList}" var="forum">
			<input type="text" value="${forum.forumName}" readonly="readonly" class="form-control ">
			<br>
			<div class="form-group">
				<label for="formdata">Forum Description</label>
				<textarea draggable="false" readonly="readonly" style="resize: none" id="formdata"
					class="form-control " rows="13">${forum.forumDesc}</textarea>
			</div>
		</c:forEach>
	</c:if>
</div>
<script
	src="${pageContext.request.contextPath}/resources/js/AngularControllers/Forum.js"></script>
