app.controller('IndividualBlog', [ '$scope', '$http', function($scope, $http) {
	var BASE_URL = 'http://localhost:8085/Babblers';
	$scope.rating = ["Rating","1", "2", "3","4","5"];
	$scope.userid=document.getElementById("userid").value; 
	$scope.blograting=" ";
	$scope.br_bid=document.getElementById("bid").value; 

    $scope.$watch('blograting', function() {
    	alert('hey, myVar has changed!'+$scope.blograting);
    	$scope.blogRatings = {	
    			br_bid    : $scope.br_bid,
    			br_userid : $scope.userid,
    			brating   : $scope.blograting,
			}
    	
        if($scope.blograting !='Rating'){
        	$http({
				method : 'POST',
				url : BASE_URL + '/blogRatings',
				data : $scope.blogRatings
			}).success(function(data, status, headers, config) {
				$scope.comments = data;// alert(data); 
			}).error(function(data, status, headers, config) {
				alert("Error");
			});
        }
        else {
        	
		}
    });
}]);