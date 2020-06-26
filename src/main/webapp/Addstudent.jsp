<%--
  Created by IntelliJ IDEA.
  User: HM
  Date: 2020/4/11
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<h2 align="center">添加学生信息</h2>
<center>
<form action="insert" method="post">
    学号：<input type="text" name="stu.StudentID"><br>
    姓名：<input type="text" name="stu.name" ><br>
    性别：
    <input type="radio" name="stu.sex" value="男" checked="checked"/>男
    <input type="radio" name="stu.sex" value="女" />女<br>
    生日：<input type="date" name="stu.birthday"><br>
    学校：<input type="text" name="stu.university" ><br>
    学院：<input type="text" name="stu.department" ><br>
    专业：<input type="text" name="stu.major" ><br>
    年级：<input type="text" name="stu.grade" ><br>
    密码：<input type="password" name="stu.password" ><br>
    <input type="submit" value="添加学生的信息"/>
    <input type="reset" value="清 除"/>
</center>
</body>
</html>
