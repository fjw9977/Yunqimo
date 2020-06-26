<%--
  Created by IntelliJ IDEA.
  User: HM
  Date: 2020/4/11
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>删除学生信息</title>
</head>
<body>
<h2 align="center"> 删除学生信息</h2>
当前登录用户：<s:property value="#session.adminUsername"/>
<s:debug/>
<form action="delete" method="post">
    <s:iterator value="#session.stuList.{?#this.studentID==#parameters.studentID[0]}" status="st">
    序号：<input type="text" name="stu.count" value="<s:property value="count"/>"><br>
    学号：<input type="text" name="stu.StudentID" value="<s:property value="studentID"/>"><br>
    姓名：<input type="text" name="stu.name" value="<s:property value="name"/>"><br>
    性别：
    <input type="radio" name="stu.sex" value="男" checked="checked"/>男
    <input type="radio" name="stu.sex" value="女" />女<br>
    生日：<input type="date" name="stu.birthday" value="<s:property value="birthday"/>"><br>
    学校：<input type="text" name="stu.university" value="<s:property value="university"/>"><br>
    学院：<input type="text" name="stu.department" value="<s:property value="department"/>"><br>
    专业：<input type="text" name="stu.major" value="<s:property value="major"/>"><br>
    年级：<input type="text" name="stu.grade" value="<s:property value="grade"/>"><br>
    <input type="submit" value="确认删除学生的信息">
    </s:iterator>
</body>
</html>
