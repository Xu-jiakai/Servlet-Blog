<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='css/bootstrap.min.css'>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-offset-3 col-md-6">
				<form class="form-horizontal" action="NewBlog" method="post">
					<span class="heading">Writing a new blog</span>
					<div class="form-group">
						<input type="text" class="form-control" name="title" required="true"
							placeholder="title"> <i class="fa fa-user"></i>
					</div>
					<div class="form-group help">
						<input type="text" class="form-control" name="author" required="true"
							placeholder="author"> <i class="fa fa-lock"></i>
					</div>
					<div class="form-group help">
						<input type="text" class="form-control" name="type" required="true"
							placeholder="type"> <i class="fa fa-lock"></i>
					</div>
					<div class="form-group">
						<textarea class="form-control" name="content" rows="3" required="true"></textarea>
					</div>
					<div class="form-group">
						<button type="submit" id ="submit" class="btn btn-default">submit</button>
						<button type="submit" class="btn btn-default">cancel</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery-3.2.1.min.js"></script>
</body>
</html>