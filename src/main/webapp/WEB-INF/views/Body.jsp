<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<div class="container text-center">
		<div class="row">
			<div class="col-sm-3 well">
				<div class="well">
					<p><a href="#">My Profile</a></p>
					<img src="" class="img-circle" height="65" width="65" alt="Avatar">
				</div>
				<div class="well">
					<p><a href="#">Interests</a></p>
					<p>
					  <span class="label label-default">News</span> 
					  <span class="label label-primary">W3Schools</span> 
					  <span class="label label-success">Labels</span> 
					  <span class="label label-info">Football</span> 
				      <span class="label label-warning">Gaming</span> 
					  <span class="label label-danger">Friends</span>
					</p>
				</div>
				<a data-toggle="tab" href="#home" class="active">Home</a>
				<a data-toggle="tab" href="#new">Settings</a>
			</div>

			<div class="col-sm-9">
				<div class="tab-content">
					<div id="home" class="tab-pane fade in active">
						<%@include file="/WEB-INF/views/Wall.jsp"%>
					</div>
					<div id="new" class="tab-pane fade">
						<h3>Image Upload</h3>
						<%@include file="/WEB-INF/views/settings.jsp"%>
					</div>
				</div>
			</div>
		</div>
	</div>
<script src="${pageContext.request.contextPath}/resources/js/AngularControllers/Profile.js"></script>
</body>
</html>

