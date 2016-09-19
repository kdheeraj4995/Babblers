<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div data-ng-app="myApp">

		<p>
			<a href="#/">Main</a>
		</p>

		<a href="#banana">Banana</a> <a href="#tomato">Tomato</a>

		<p>Click on the links to change the content.</p>

		<p>Use the "otherwise" method to define what to display when none
			of the links are clicked.</p>

		<div data-ng-view></div>

		<script>
			var app = angular.module('myApp', [ 'ngRoute' ]);
			app
					.config(function($routeProvider) {
						$routeProvider
								.when(
										'/banana',
										{
											template : "<h1>Banana</h1><p>Bananas contain around 75% water.</p>"
										})
								.when(
										'/tomato',
										{
											template : "<h1>Tomato</h1><p>Tomatoes contain around 95% water.</p>"
										})
								.otherwise(
										{
											template : "<h1>Nothing</h1><p>Nothing has been selected</p>"
										});
					});
		</script>
	</div>
</body>
</html>