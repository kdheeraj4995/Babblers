<!DOCTYPE html>
<html lang="en-US" data-ng-controller="UserImage">
<body>
	<input type="file" class=" btn btn-default" id="file" name="file"  onchange="angular.element(this).scope().uploadFile(this.files)">
	<input type="submit" class=" btn btn-primary" value="Add Image">
</body>
</html>
