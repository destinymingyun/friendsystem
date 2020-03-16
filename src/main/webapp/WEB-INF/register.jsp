<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 16/3/2020
  Time: 下午4:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/register.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/form.css" type="text/css"/>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
</head>
<body>
<main>
    <div class="register-box register-width">
        <div class="logo">
            <img src="/static/img/register-logo.png">
        </div>
        <h1>加入我们</h1>
        <hr>
        <h2>账号信息</h2>
        <div class="input-box">
            <label>
                <span>账户:</span>
                <input class="input" placeholder="请输入账户">
            </label>
        </div>
        <div class="input-box">
            <label>
                <span>密码:</span>
                <input class="input"  type="password" placeholder="请输入密码">
            </label>
        </div>
        <div class="input-box">
            <label>
                <span>确认密码:</span>
                <input class="input" type="password" placeholder="请确认密码">
            </label>
        </div>
        <hr>
        <h2>个人基础信息</h2>
        <div class="input-box">
            <label>
                <span>网站昵称:</span>
                <input class="input" type="password" placeholder="姓名父母定，昵称自己起！">
            </label>
        </div>
        <div class="radio-box">
            <span>性别:</span>
            <label>
                <img src="/static/img/female.png">
                <input type="radio" name="sex"></label>
            </label>
            <label>
                <img src="/static/img/male.png">
                <input type="radio" name="sex"></label>
            </label>
        </div>
        <div style="margin-top: 30px">
            <button class="button-submit register-width">现在注册</button>
        </div>
        <div class="other">
            <a href="/view/login">已有账号？登录</a>
            <a href="/view/index">暂不注册？先去逛逛</a>
        </div>
    </div>
</main>
</body>
</html>
