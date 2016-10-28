<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<div data-ng-controller="FriendController">
			<div data-ng-repeat="user in users">
				<a href="${pageContext.request.contextPath}/profile/{{user.userid}}" class ="thumbnail">{{user.name}}</a>
			</div>
	<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/Friends.js"></script>
</div>
