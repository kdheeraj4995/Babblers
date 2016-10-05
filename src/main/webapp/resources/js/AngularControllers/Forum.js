app.controller('ForumController', [ '$scope', '$http', function($scope, $http) {

	$scope.submit = function() {
		var BASE_URL = 'http://localhost:8085/Babblers';
		$scope.forum = {	
			fid       : $scope.forumid,
			forumName : $scope.forumName,
			forumDesc : $scope.forumDesc,
		}
		$http({
			method : 'POST',
			url : BASE_URL +'/CreateForum',
			data : $scope.forum
		}).success(function(data, status, headers, config) {
			alert("Success");
			$scope.forumid ='';
			$scope.forumName = '';
			$scope.forumDesc = '';
		}).error(function(data, status, headers, config) {
			alert("Error");
		});	
	};
	
	
	$scope.getAllForums = function() {
		$http({
			method : 'GET',
			url : 'getAllForums'
		}).success(function(data, status, headers, config) {
			$scope.forums = data;// alert(data); 
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
	
	$scope.getSingleForum = function() {
		$http({
			method : 'GET',
			url : 'Forum'
		}).success(function(data, status, headers, config) {
			$scope.forums = data;// alert(data); 
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
	
	$scope.deleteForum = function(fid) {
		$http({
			method : 'DELETE',
			url : 'deleteForum/'+fid
		}).success(function(data, status, headers, config) {
			alert("Success"); 
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	}
	

	$scope.editForum = function(fid) {
		$http({
			method : 'GET',
			url : 'editForum/'+fid
		}).success(function(data, status, headers, config) {
			$scope.forum = data;// alert(data); 
			$scope.forumid = $scope.forum.fid;
			$scope.forumName = $scope.forum.forumName;
			$scope.forumDesc = $scope.forum.forumDesc;
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
	
	$scope.accessForum = function(f_userid) {
		//alert("Hello"+f_userid);
		if($scope.userid==f_userid)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}]);


