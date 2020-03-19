<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 19/3/2020
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员主页</title>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/admin.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/footer.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/admin-nav.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/table.css" type="text/css"/>
</head>
<body>
<div class="panel">
    <%@include file="/WEB-INF/public/admin-nav.jsp" %>
    <main>
        <header>
            <div>欢迎您！TPQ</div>
        </header>
        <div class="admin-banner">
            <img src="/static/img/admin-banner.jpg">
        </div>
        <section class="main-panel">
            <table class="table">
                <thead>
                <tr>
                    <th>用户Id</th>
                    <th>用户账户</th>
                    <th>用户账户状态</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>1</td>
                    <td>test1</td>
                    <td>可用</td>
                    <td>停用</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>test2</td>
                    <td>可用</td>
                    <td>停用</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>test3</td>
                    <td>可用</td>
                    <td>停用</td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>test4</td>
                    <td>可用</td>
                    <td>停用</td>
                </tr>
                </tbody>
            </table>
        </section>
        <%@include file="/WEB-INF/public/footer.jsp" %>
    </main>
</div>
</body>
</html>
