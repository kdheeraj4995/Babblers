app.controller('IndividualForum', [ '$scope', '$http', function($scope, $http) {
	
	    $scope.commentDesc = '';
	    $scope.c_fid=document.getElementById("fid").value;
	    $scope.Comment = function() {
			var BASE_URL = 'http://localhost:8085/Babblers';
			$scope.comment = {	
				c_fid : $scope.c_fid,
				commentDesc : $scope.commentDesc,
			}
			$http({
				method : 'POST',
				url : BASE_URL +'/ForumComments',
				data : $scope.comment
			}).success(function(data, status, headers, config) {
				alert("Success");
			    $scope.commentDesc = '';
			}).error(function(data, status, headers, config) {
				alert("Error");
			});	
		};
}]);


