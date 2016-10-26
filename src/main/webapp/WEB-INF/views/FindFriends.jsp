

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<div data-ng-controller="FriendController">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<!-- <th>Forum ID</th> -->
					<th>Forum Name</th>
					<th colspan="2">Forum Description</th>
				</tr>
			</thead>
			<tbody>
				<tr data-ng-repeat="user in users">
					<td>{{user.username}}</td>
					<td>{{user.name}}</td>
				</tr>
			</tbody>
		</table>
		
		<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/Friends.js"></script>
		
	</div>
