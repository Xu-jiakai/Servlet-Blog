# Servlet-Blog

2018-01-26    实现了登陆、注销和注册功能；
              其中注册功能输入中文，注册成功在数据库查看发现乱码；
              
2018-01-26    寻找到注册功能getParameter()读取的中文为乱码的原因；

              原因：Http请求传输时将url以ISO-8859-1编码，服务器收到
	      字节流后默认会以ISO-8859-1编码来解码成字符流（造成中文
	      乱码）
	      解决方法：
	      String str=new String(request.getParameter("参数名")
	      	.getBytes("iso-8859-1"),"utf-8");
