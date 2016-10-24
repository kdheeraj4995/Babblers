<!DOCTYPE html>
<html lang="en-US" data-ng-controller="UserImage">
<body>
	<div class=" well">
		<h3>Image Upload</h3>
		<input type="file" class=" btn btn-default" id="file" name="file" class="form-control" 
		onchange="angular.element(this).scope().uploadFile(this.files)">
	</div>
</body>
</html>
