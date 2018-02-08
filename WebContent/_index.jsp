<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.blog.dao.*,com.blog.entity.*,java.util.List"%>
<!-- BOOTSTRAP CORE STYLE CSS -->
<link href="css/bootstrap.css" rel="stylesheet" />
<!-- FONTAWESOME STYLE CSS -->
<link href="css/font-awesome.css" rel="stylesheet" />
<!-- CUSTOM STYLE CSS -->
<link href="css/style.css" rel="stylesheet" />

<%
	BlogDaoImpl blog = new BlogDaoImpl();
	List<Blog> articles = blog.listAll();
	int size = articles.size();
	for (int i = 0; i < size; i++) {
%>
<div class="container">
	<div class="row">
		<div class="col-md-9">
			<div class="blog-main">
				<div class="heading-blog">
					<%=articles.get(i).getTitle()%>
				</div>
				<div class="blog-info">
					<span class="label label-primary"> 
					<%=articles.get(i).getCreate_time()%>
					</span> 
					<span class="label label-success"> 
					<%=articles.get(i).getType()%>
					</span> 
					<span class="label label-danger"> 
					<%=articles.get(i).getAuthor()%>
					</span>
				</div>
				<div class="blog-txt">
					<%=articles.get(i).getContent().replace(" ", "&nbsp;").replace("\n", "<br/>").substring(0, 200)%>......
				</div>
			</div>
		</div>
	</div>
</div>
<%
	}
%>
