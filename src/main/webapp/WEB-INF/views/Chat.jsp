<html lang="en">
<head>
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700"
	rel="stylesheet" type="text/css" />
<link href="resources/css/demo.css" rel="stylesheet" type="text/css" />
</head>
<body data-ng-app="chatApp">
	<div data-ng-controller="ChatCtrl" class="container">
		<form data-ng-submit="addMessage()" name="messageForm">
			<input type="text" placeholder="Compose a new message..."
				data-ng-model="message" />
			<div class="info">
				<span class="count" data-ng-bind="max - message.length"
					data-ng-class="{danger: message.length > max}">140</span>
				<button type="submit"
					data-ng-disabled="message.length > max || message.length == 0">Send</button>
			</div>
		</form>
		<hr>
		<p data-ng-repeat="message in messages | orderBy:'time':true"
			class="message">
			<time>{{message.time | date:'HH:mm'}}</time>
			<span data-ng-class="{self: message.self}">{{message.message}}</span>
		</p>
	</div>

	<script src="resources/libs/sockjs/sockjs.min.js" type="text/javascript"></script>
	<script src="resources/libs/stomp-websocket/lib/stomp.min.js" type="text/javascript"></script>
	<script src="resources/libs/lodash/dist/lodash.min.js"></script>
	
	<script src="resources/apps/app.js" type="text/javascript"></script>
	<script src="resources/apps/controllers.js" type="text/javascript"></script>
	<script src="resources/apps/services.js" type="text/javascript"></script>

</body>
</html>