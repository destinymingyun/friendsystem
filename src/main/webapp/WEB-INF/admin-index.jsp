<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 18/3/2020
  Time: 20:59
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

        </section>
        <%@include file="/WEB-INF/public/footer.jsp" %>
    </main>
</div>
</body>
</html>
