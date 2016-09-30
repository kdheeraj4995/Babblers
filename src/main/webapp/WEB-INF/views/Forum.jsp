<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div data-ng-controller="ForumController">

	<sec:authorize access="isAuthenticated()">
		<form role="form" data-ng-submit="submit()"
			data-ng-controller="ForumController">
			<h3 align="center">Create Forum</h3>
			<div class="form-group">
				<input type="text" class="form-control input-sm"
					placeholder="Forum Id" data-ng-model="forumid"
					data-ng-show="forumid" data-ng-disabled="forumid">
			</div>
			<div class="form-group">
				<input type="text" class="form-control input-sm"
					placeholder="Forum Title" data-ng-model="forumName">
			</div>
			<div class="form-group">
				<label for="formdata">Forum Description</label>
				<textarea draggable="false" style="resize: none" id="formdata"
					class="form-control " rows="13" data-ng-model="forumDesc"></textarea>
			</div>
			<div align="right">
				<button type="submit" class="btn btn-success">Save Forum</button>
			</div>
		</form>
	</sec:authorize>
	<br>
	<div data-ng-init="getAllForums()">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<!-- <th>Forum ID</th> -->
					<th>Forum Name</th>
					<th>Forum Description</th>
					<sec:authorize access="isAuthenticated()">
						<th>Delete Forum</th>
					</sec:authorize>
				</tr>
			</thead>
			<tbody>
				<tr data-ng-repeat="forum in forums">
					<td width="15%">{{forum.forumName}}</td>
					<td width="70%">{{forum.forumDesc}}</td>
					<td width="20%">
						<div class="btn-group  btn-group-justified ">
							<sec:authorize access="isAuthenticated()">
								<a class="btn btn-primary btn-xs"
									data-ng-click="deleteForum(forum.fid)">Delect</a>

								<a class="btn btn-primary btn-xs"
									data-ng-click="editForum(forum.fid)">Edit</a>
							</sec:authorize>
							<a href="forum/{{forum.fid}}" class="btn btn-primary btn-xs">View</a>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</div>

	<script
		src="${pageContext.request.contextPath}/resources/js/AngularControllers/Forum.js"></script>
</div>

