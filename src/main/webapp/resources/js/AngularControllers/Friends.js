app.controller('FriendController', [ '$scope', '$http', function($scope, $http) {
	  var BASE_URL = 'http://localhost:8085/Babblers';
	  
	  $scope.getAllUsers = function() {
			$http({
				method : 'GET',
				url : 'userList'
			}).success(function(data, status, headers, config) {
				$scope.users = data;// alert(data); 
				console.log($scope.users)
			}).error(function(data, status, headers, config) {
				alert("Error");
			});
		};
	
		$scope.getAllUsers();
}]);