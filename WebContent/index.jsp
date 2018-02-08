<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.blog.dao.*,com.blog.entity.*,java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
<title>My Blog</title>
<!-- BOOTSTRAP CORE STYLE CSS -->
<link href="css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLE CSS -->
<link href="css/font-awesome.css" rel="stylesheet" />
<!-- CUSTOM STYLE CSS -->
<link href="css/style.css" rel="stylesheet" />
</head>
<body>
	<!-- blog header -->
	<section class="header-section">
	<div class="container">
		<ul class="nav navbar-nav">
			<li class="active" data-id="index"><a href="index.jsp"><h1>
						<strong>My Blog</strong>
					</h1></a></li>
			<li data-id="java"><a href="#"><h2>JAVA</h2></a></li>
			<li data-id="python"><a href="#"><h2>PYTHON</h2></a></li>
			<li data-id="http"><a href="#"><h2>HTTP</h2></a></li>
		</ul>
	</div>
	<a href="newBlog.jsp">New</a>
	</section>
	
	<!-- blog content -->
	<section id="content"></section>
	<hr />
	
	<!--  blog-footer -->
	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center set-foot">
				Xu Jiakai | Xu_jiakai@foxmail.com | <a
					href="http://www.xujiakai.xyz">www.xujiakai.xyz</a>
			</div>
			<a></a>
		</div>
	</div>
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/sort.js"></script>
</body>
</html>
