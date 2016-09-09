<!DOCTYPE html>
<html>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<body data-ng-app="myApp">
	<div data-ng-controller="myCtrl">

		<pre>
User name : <input type="text" data-ng-model="username">
			
Password  : <input type="text" data-ng-model="password"> 
			
Mobile    : <input type="number" data-ng-model="mobile">
		
              <button data-ng-click=myCtrl.myFunc()>Register</button>   <button
				type="reset">Reset</button>    
		
</pre>
		<p>Response: {{count}}</p>
		<p>Response: {{responseData}}</p>
	</div>


	<script type="text/javascript">
		angular.module('myApp', []).controller('myCtrl', function($scope) {
			var dataObj = {
				"username" : $scope.username,
				"password" : $scope.password,
				"mobile" : $scope.mobile
			};
			var count = 0;
			$scope.myFunc = function() {
				var response = $http.post('Register', dataObj);
				response.success(function(data, status, headers, config) {
					$scope.responseData = data;
				});
				response.error(function(data, status, headers, config) {
					alert("Exception details: " + JSON.stringify({
						data : data
					}));
				});
			};
		});
	</script>

	<!-- <body>

<div data-ng-app="myApp" data-ng-controller="myCtrl">

<button data-ng-click="myFunction()">Click Me!</button>

<p>{{ count }}</p>

</div>
<script>
var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.count = 0;
    $scope.myFunction = function() {
        $scope.count++;
    }
});
</script>

</body> -->
</body>
</html>

