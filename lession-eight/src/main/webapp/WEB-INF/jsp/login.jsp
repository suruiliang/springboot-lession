<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/15/015
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form method="post" action="/user/login">
    <table>
        <tr>
            <th>用户名</th>
            <td><input type="text" placeholder="name" name="name"></td>
        </tr>
        <tr>
            <th>密码</th>
            <td><input type="password" placeholder="pwd" name="pwd"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
