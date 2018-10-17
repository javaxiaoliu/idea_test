<%--
  Created by IntelliJ IDEA.
  User: ly
  Date: 2018/10/15
  Time: 下午10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户录入页面</title>
    <form action="${pageContext.request.contextPath}/customer/save.action" method="post" >


    客户姓名：<input type="text" name="name"><br/>
    客户性别：<input type="text" name="gender"><br/>
    客户年龄：<input type="text" name="age"><br/>
    <input type="submit" value="提交">
    </form>
</head>
<body>

</body>
</html>
