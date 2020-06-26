<%--
  Created by IntelliJ IDEA.
  User: HM
  Date: 2020/4/10
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生登录</title>
</head>
<body>
<center>
<s:form action="studentLogin" method="POST" >
    学号：<input type="text" name="stu.studentID" align="center"><br>
    密码：<input type="password" name="stu.password" align="center"> <br><br>
    <s:submit value="登录"/>
</s:form>
</center>
</body>
</html>


