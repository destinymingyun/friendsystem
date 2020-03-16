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
    <title>登录</title>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/login.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/form.css" type="text/css"/>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
</head>
<body>
<main>
    <div class="login-box">
        <div class="logo">
            <img src="/static/img/account-pig.png">
        </div>
        <div>
            <div class="input-box">
                <label>
                    <img src="/static/img/user-icon.png">
                    <input class="input" placeholder="请输入账户">
                </label>
            </div>
            <div class="input-box">
                <label>
                    <img src="/static/img/password-icon.png">
                    <input class="input" type="password" placeholder="请输入密码">
                </label>
            </div>
        </div>
        <div>
            <button class="button-submit login-width">登录</button>
        </div>
        <div class="other">
            <a href="#">没有账户？注册</a>
            <a href="#">忘记密码？找回</a>
        </div>
    </div>
</main>
</body>
</html>
