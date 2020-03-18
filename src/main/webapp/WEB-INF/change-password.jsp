<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 18/3/2020
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/form.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/change-password.css" type="text/css"/>
</head>
<body>
<main>
    <div class="change-password-box">
        <h1>修改密码</h1>
        <div class="input-box">
            <label>
                <img src="/static/img/user-icon.png">
                <input class="input" placeholder="请输入账户">
            </label>
        </div>
        <div class="input-box">
            <label>
                <img src="/static/img/password-icon.png">
                <input class="input" type="password" placeholder="请输入旧密码">
            </label>
        </div>
        <div class="input-box">
            <label>
                <img src="/static/img/password-icon.png">
                <input class="input" type="password" placeholder="请输入新密码">
            </label>
        </div>
        <div style="margin: 30px 0">
            <button class="button-submit change-password-width">注册</button>
        </div>
    </div>
</main>
</body>
</html>
