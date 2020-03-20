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
                    <input class="input" placeholder="请输入账户" id="account">
                </label>
            </div>
            <div class="input-box">
                <label>
                    <img src="/static/img/password-icon.png">
                    <input class="input" type="password" placeholder="请输入密码" id="password">
                </label>
            </div>
        </div>
        <div class="error">
            <h3>账户或密码错误</h3>
        </div>
        <div style="margin-top: 20px">
            <button class="button-submit login-width id" id="loginButton">登录</button>
        </div>
        <br>
        <div class="other">
            <a href="/public/register">没有账户？注册</a>
            <a href="/public/find-password">忘记密码？找回</a>
        </div>
    </div>
</main>
<script type="text/javascript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
<script type="text/javascript" src="/static/js/service/accountService.js"></script>
<script>
    $("#loginButton").click(function () {
        var account = {
            "account": $("#account").val(),
            "password": $("#password").val(),
        };
        console.log(account);
        login(JSON.stringify(account));
    })
</script>
</body>
</html>
