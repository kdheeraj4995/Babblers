app.controller('RegController', [ '$scope', '$http', function($scope, $http) {

	$scope.submit = function() {
		var BASE_URL = 'http://localhost:8085/Babblers';
		$scope.users = {
			name : $scope.name,
			username : $scope.username,
			password : $scope.password,
			mobile : $scope.mobile,
			email : $scope.email,
			gender : $scope.gender
		}
		$http({
			method : 'POST',
			url : BASE_URL + '/PostService',
			data : $scope.users
		}).success(function(data, status, headers, config) {
			//alert("Success");
			$scope.name = '';
			$scope.username = '';
			$scope.password = '';
			$scope.mobile = '';
			$scope.email = '';
			$scope.gender = '';
			$scope.Confirm_Password='';
			$("#registration").modal("hide");
			
		}).error(function(data, status, headers, config) {
			alert("Error");
		});	
	};
}]);
