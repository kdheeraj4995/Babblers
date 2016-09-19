app.controller('ForumController', [ '$scope', '$http', function($scope, $http) {
	$scope.submit = function() {
		var BASE_URL = 'http://localhost:8085/Babblers';
		$scope.forum = {
			forumName : $scope.forumName,
			forumDesc : $scope.forumDesc,
		}
		$http({
			method : 'POST',
			url : BASE_URL + '/CreateForum',
			data : $scope.forum
		}).success(function(data, status, headers, config) {
			alert("Success");
			$scope.forumName = '';
			$scope.forumDesc = '';
		}).error(function(data, status, headers, config) {
			alert("Error");
		});	
	};
}]);

