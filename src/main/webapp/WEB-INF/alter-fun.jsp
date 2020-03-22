<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/22
  Time: 0:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>create-fun</title>
    <meta charset="UTF-8">
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png" />
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/nav.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/head.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/footer.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/index-main.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/alter-fun.css" type="text/css"/>


</head>
<body>
<nav class="nav">
    <div class="nav-box normal-width">
        <div class="logo"><img src="/static/img/logo.png"></div>
        <div class="nav-item">
            <ul>
                <li><a href="#">当前活动</a></li>
                <li><a class="active" href="/public/literature-list">兴趣部落</a></li>
                <li><a href="/api/literature/write">创建话题</a></li>
                <li><a href="/public/login">登录</a></li>
            </ul>
        </div>
    </div>
</nav>
<main class="main">
    <section class="activities">
        <div class="normal-width">
            <div class="activities-title">
                <h2>欢迎来到您的兴趣部落</h2>
                <h6>您可以在此修改任意兴趣内容</h6>
            </div>
        </div>
        <div class="fun-card-box normal-width">
            <div class="card">
                <div class="title"><p>title</p></div>
                <div class="content"><p>content</p></div>
                <div class="button"><button class="button-content">修改</button></div>
            </div>
            <div class="card">
                <div class="title"><p>title</p></div>
                <div class="content"><p>content</p></div>
                <div class="button"><button class="button-content">修改</button></div>
            </div>
            <div class="card">
                <div class="title"><p>title</p></div>
                <div class="content"><p>content</p></div>
                <div class="button"><button class="button-content">修改</button></div>
            </div>
        </div>
    </section>
</main>
<footer class="footer">
    <div class="footer-items normal-width">
        <div>版权所有©2016.作者<a href="#">唐帕绮</a>保留所有权利</div>
        <div>作者邮箱:<a href="#">1261805554@qq.com</a></div>
    </div>
</footer>
<script type="text/javascript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
</body>
</html>
