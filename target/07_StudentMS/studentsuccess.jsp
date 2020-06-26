<%--
  Created by IntelliJ IDEA.
  User: HM
  Date: 2020/4/11
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生登录</title>
</head>
<body>
当前登录用户：<s:property value="#session.studentName"/>
<h2 align="center">我的个人信息</h2>
<table border="11" align="center" >
    <tr>
        <td width="100px">学号</td>
        <td width="100px">姓名</td>
        <td width="50px">性别</td>
        <td width="100px">生日</td>
        <td width="100px">大学</td>
        <td width="100px">院系</td>
        <td width="100px">专业</td>
        <td width="100px">年级</td>
        <td width="100px">修改密码</td>
    </tr>
    <s:iterator value ="stuList" status="st">
        <tr>
            <td><s:property value="studentID"/> </td>
            <td><s:property value="name"/> </td>
            <td><s:property value="sex"/> </td>
            <td><s:property value="birthday"/> </td>
            <td><s:property value="university"/> </td>
            <td><s:property value="department"/> </td>
            <td><s:property value="major"/> </td>
            <td><s:property value="grade"/> </td>
            <td><a href="student_password.jsp?studentID=<s:property value="studentID"/>">修改密码</a></td>
        </tr>
    </s:iterator>
</table>
<h3 align="center"><a href="index.jsp">退出系统</a></h3>
<s:debug/>
</body>
</html>
