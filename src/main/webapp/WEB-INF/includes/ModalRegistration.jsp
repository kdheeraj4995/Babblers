<style>
.modal-header, h4, .close {
	background-color: #5cb85c;
	color: white !important;
	text-align: center;
	font-size: 20px;
}
</style>
<div class="container">
	<!-- Trigger the modal with a button -->
	<!-- Modal -->
	<div class="modal fade" id="registration" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header" style="padding: 15px 50px;">
					<h4>Babbler Registration</h4>
				</div>
				<div class="modal-body" style="padding: 30px 50px;">
					<form role="form" data-ng-submit="submit()"
						data-ng-controller="RegController" method="post">
						<div class="form-group form-group-sm">
							<div class="input-group">
								<div class="input-group-addon">
									<i class="glyphicon glyphicon-plus"></i>
								</div>
								<input type="text" class="form-control" placeholder="Name"
									data-ng-model="name">
							</div>
							<br>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="glyphicon glyphicon-user"></i>
								</div>
								<input type="text" class="form-control" placeholder="Username"
									data-ng-model="username">
							</div>
							<br>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="glyphicon glyphicon-eye-open"></i>
								</div>
								<input type="password" class="form-control"
									placeholder="Password" data-ng-model="password">
							</div>
							<br>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="glyphicon glyphicon-eye-close"></i>
								</div>
								<input type="password" class="form-control"
									data-ng-model="Confirm_Password"
									placeholder="Re Enter Password">
							</div>
							<br>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="glyphicon glyphicon-envelope"></i>
								</div>
								<input type="email" class="form-control" placeholder="Email"
									data-ng-model="email">
							</div>
							<br>
							<div class="input-group">
								<div class="input-group-addon">
									<i class="glyphicon glyphicon-phone"></i>
								</div>
								<input type="text" class="form-control"
									placeholder="Mobile Number" data-ng-model="mobile">
							</div>
							<br>
							<div class="input-group">
								<label class="radio-inline"> <input type="radio"
									name="optradio" value="Male" data-ng-model="gender">Male
								</label> <label class="radio-inline"> <input type="radio"
									value="Female" name="optradio" data-ng-model="gender">Female
								</label>
							</div>
						</div>
						<p>By clicking Create an account, you agree to our Terms and
							that you have read our Data Policy, including our Cookie Use.</p>
						<br>
						<button type="submit" class="btn btn-success  btn-block">
							<span class="glyphicon glyphicon-off"></span> Register
						</button>
					</form>
				</div>
				<!-- <div class="modal-footer" style="padding-left: 50px">
					<button type="submit" class="btn btn-danger  btn-block"
						data-dismiss="modal">
						<span class="glyphicon glyphicon-remove-sign "></span> Cancel
					</button>
					<p>
						Not a member? <a href="#">Sign Up</a>
					</p>
					<p>
						Forgot <a href="#">Password?</a>
					</p>
				</div> -->
			</div>

		</div>
	</div>
</div>
<script>
	$(document).ready(function() {
		$("#reg").click(function() {
			$("#registration").modal();
		});
	});
</script>
