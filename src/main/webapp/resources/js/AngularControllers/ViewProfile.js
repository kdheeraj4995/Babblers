app.controller('ViewProfile', [ '$scope', '$http', function($scope, $http) {
	var BASE_URL = 'http://localhost:8085/Babblers';
	$scope.profileid = document.getElementById("profileid").value; 
	$scope.profiledata= function() {
		$http({
			method : 'GET',
			url : BASE_URL+'/profiledata/'+ $scope.profileid ,
		}).success(function(data, status, headers, config) {
			$scope.user = data
			
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
	$scope.profiledata();
}]);