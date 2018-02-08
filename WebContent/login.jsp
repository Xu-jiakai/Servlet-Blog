<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link rel='stylesheet' href='css/bootstrap.min.css'>
<link rel='stylesheet' href='css/login.css'>
</head>
<body>
<div class="container">
		<div class="row">
			<div class="col-md-offset-3 col-md-6">
				<form class="form-horizontal" action="Login" method="post">
					<span class="heading">User Login</span>
					<div class="form-group">
						<input type="text" class="form-control" name="username" required="true"
							placeholder="Username"> <i class="fa fa-user"></i>
					</div>
					<div class="form-group help">
						<input type="password" class="form-control" name="password" required="true"
							placeholder="Password"> <i class="fa fa-lock"></i>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-default">Login</button>
					</div>
					<a href="register.jsp">No account?Go to register</a>
				</form>
			</div>
		</div>
	</div>
</body>
</html>