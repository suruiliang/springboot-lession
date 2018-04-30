<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/15/015
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h3>upload single file</h3>
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file">
    <input type="submit" value="submit">
</form>
<h3>upload multi files</h3>
<form action="/uploads" method="post" enctype="multipart/form-data">
    文件1<input type="file" name="file"><br/>
    文件2<input type="file" name="file"><br/>
    文件3<input type="file" name="file"><br/>
    <input type="submit" value="submit">
</form>
</body>
</html>
