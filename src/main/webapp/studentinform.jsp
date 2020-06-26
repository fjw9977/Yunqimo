<%--
  Created by IntelliJ IDEA.
  User: HM
  Date: 2020/4/11
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>学生信息</title>
</head>
<body>

<h2 align="center" >查看学生信息</h2>
当前登录：管理员:<s:property value = "#session.adminUsername"/><br>
<form action="findByName" method="post">
    根据姓名查询：<input type="text" name="stu.name">
    <input type="submit" value="查询">
    <a href="Addstudent.jsp"><input type="button" value="添加学生信息"> </a>
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
        <td width="50px">修改</td>
        <td width="50px">删除</td>
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
            <td><a href="Updatestudent.jsp?studentID=<s:property value="studentID"/>">修改</a></td>
            <td><a href="Deletestudent.jsp?studentID=<s:property value="studentID"/>">删除</a> </td>

        </tr>
    </s:iterator>
</table>
<h3 align="center"><a href="index.jsp">退出系统</a></h3>
<s:debug/>

</body>
</html>
