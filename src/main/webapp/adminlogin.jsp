<%--  Created by IntelliJ IDEA.
  User: HM
  Date: 2020/4/10
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>管理员登录</title>
</head>
<body>
<center>
<s:form action="adminLogin" method="POST" >
    username：<input type="text" name="username"align="center"><br>
    password：<input type="password" name="password" align="center"> <br><br>
    <s:submit value="登录"/>
</s:form>
</center>
</body>
</html>