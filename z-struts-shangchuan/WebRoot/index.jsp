<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
  
<%  
String path = request.getContextPath();  
  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
	  <head>  
	    <base href="<%=basePath%>">  
	    <title>My JSP 'upload.jsp' starting page</title>  
	    <meta http-equiv="pragma" content="no-cache">  
	    <meta http-equiv="cache-control" content="no-cache">  
	    <meta http-equiv="expires" content="0">      
	    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
	    <meta http-equiv="description" content="This is my page">  
	    <!-- 
	    <link rel="stylesheet" type="text/css" href="styles.css"> 
	    -->  
	  </head>  
	  <body>  
	    <div align="center">  
	    <h1>文件上传</h1>  
	<!-- 此处的enctype属性必须要更改，一般此处不需要更改，默认为application/x-www-form-urlencoded，它只处理表单里的value属性传递的是字符串，但是当上传文件时必须要改为：multipart/form-data  
	-->  
	    <form action="${pageContext.request.contextPath }/upFile.action" enctype="multipart/form-data" method="post">  
	        上传文件:<input type="file" name="upload"/><br/>  
	        <input type="submit" value="上传">"  
	    </form>  
	    <h2>文件下载内容：</h2><br/>
	     <form action="${pageContext.request.contextPath }/FileDownload.action?fileName=oracle.txt"  method="post">  
	    		<input type="submit" name="下载" value="下载"/>
	    </form>  
	    </div>  
	  </body>  
	</html>  
	  
