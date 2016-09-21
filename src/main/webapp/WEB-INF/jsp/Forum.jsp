<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<div>
	<form role="form" data-ng-submit="submit()" data-ng-controller="ForumController">
		<h3 align="center">Create Forum</h3>
		<div class="form-group">
			<input type="text" class="form-control" placeholder="Forum Title" data-ng-model="forumName">
		</div>
		<div class="form-group">
			<label for="formdata">Forum Description</label>
			<textarea draggable="false" style="resize: none" id="formdata"
				class="form-control" rows="13" data-ng-model="forumDesc"></textarea>
		</div>
		<sec:authorize access="isAuthenticated()">
		<div align="right">
			<button type="submit" class="btn btn-success">Create Forum</button>
		</div>
		</sec:authorize>
	</form>
	
	<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/Forum.js"></script>
</div>

