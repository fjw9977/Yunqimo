<%--
  Created by IntelliJ IDEA.
  User: HM
  Date: 2020/4/11
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>信电管理员</title>
</head>
<body>
<h2 align="center" >查看信息与电气工程学院学生信息</h2>
当前登录：管理员:<s:property value = "#session.adminUsername"/><br>
<form action="findByXinName" method="post">
    根据姓名查询：<input type="text" name="stu.name">
    <input type="submit" value="查询">
</form>
<%--<s:form action = "findByDept" method="post">--%>
<%--    <s:select list="stu.department" label="选择学院" headerValue="--请选择--" />--%>
<%--    <s:submit value="查询"/>--%>
<%--</s:form>--%>
<table border="11" align="center" >
    <tr>
        <td width="50px">序号</td>
        <td width="100px">学号</td>
        <td width="100px">姓名</td>
        <td width="50px">性别</td>
        <td width="100px">生日</td>
        <td width="100px">大学</td>
        <td width="100px">院系</td>
        <td width="100px">专业</td>
        <td width="100px">年级</td>
    </tr>
    <s:iterator value ="stuList" status="st">
        <tr>
            <td><s:property value="#st.count"/> </td>
            <td><s:property value="studentID"/> </td>
            <td><s:property value="name"/> </td>
            <td><s:property value="sex"/> </td>
            <td><s:property value="birthday"/> </td>
            <td><s:property value="university"/> </td>
            <td><s:property value="department"/> </td>
            <td><s:property value="major"/> </td>
            <td><s:property value="grade"/> </td>

        </tr>
    </s:iterator>
</table>
<h3 align="center"><a href="index.jsp">退出系统</a></h3>
<s:debug/>
</body>
</html>
