<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
<link rel='stylesheet' href='css/bootstrap.min.css'>
<link rel='stylesheet' href='css/login.css'>
</head>
<body>
<div class="container">
		<div class="row">
			<div class="col-md-offset-3 col-md-6">
				<form class="form-horizontal" action="Register" method="post">
					<span class="heading">User Register</span>
					<div class="form-group">
						<input type="text" class="form-control" name="username" required="required"
							placeholder="Username"> <i class="fa fa-user"></i>
					</div>
					<div class="form-group help">
						<input type="password" class="form-control" name="password" id="pwd1" required="required"
							placeholder="Password"> <i class="fa fa-lock"></i>
					</div>
					<div class="form-group help">
						<input type="password" class="form-control" name="password_again" id="pwd2" required="required"
							placeholder="Password Again"> <i class="fa fa-lock"></i>
						<p id="message"></p>
					</div>
					<div class="form-group">
						<button type="submit" id ="submit" class="btn btn-default">Register</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>