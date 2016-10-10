app.controller('UserImage', [ '$scope', '$http', function($scope, $http) {
	var BASE_URL = 'http://localhost:8085/Babblers';

	$scope.uploadFile = function(files) {
	    var image = new FormData();
	    //Take the first selected file
	    image.append("file", files[0]);

	    $http.post(BASE_URL+'/imageUpload', image, {
	        withCredentials: true,
	        headers: {'Content-Type': undefined },
	        transformRequest: angular.identity
	    }).success(function(data, status, headers, config) {
			alert("success")
			console.log(image)
		}).error(function(data, status, headers, config) {
			alert("error")
		});

	};
}]);

