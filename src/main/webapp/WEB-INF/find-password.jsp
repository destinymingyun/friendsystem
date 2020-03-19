<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 19/3/2020
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>找回密码</title>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/form.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/find-password.css" type="text/css"/>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
</head>
<body>
<main>
    <div class="find-password-box find-password-box-width">
        <div class="logo">
            <img src="/static/img/account-pig.png">
        </div>
        <ul class="find—password-title">
            <li>
                <div>1</div>
                输入账号
            </li>
            <li>
                <div>2</div>
                回答问题
            </li>
            <li>
                <div>3</div>
                重置密码
            </li>
            <li>
                <div>4</div>
                返回登录
            </li>
        </ul>
        <div class="find-password-card">
            <div class="input-box">
                <label>
                    <img src="/static/img/user-icon.png">
                    <input class="input" placeholder="请输入要找回密码的账户">
                </label>
            </div>
            <div style="margin-top: 20px">
                <button class="button-submit find-password-box-width">下一步</button>
            </div>
        </div>
        <div class="find-password-card">
            <div class="input-box">
                <label>
                    <input class="input" placeholder="请回答你父母第一次见面的位置">
                </label>
            </div>
            <div class="find-password-card">
                <div class="input-box">
                    <label>
                        <input class="input" placeholder="请回答你小学六年级的班主任">
                    </label>
                </div>
            </div>
            <div style="margin-top: 20px">
                <button class="button-submit find-password-box-width">下一步</button>
            </div>
        </div>
        <div class="find-password-card">
        <div class="input-box">
            <label>
                <input class="input" placeholder="请输入您的新密码">
            </label>
        </div>
        <div class="find-password-card">
            <div class="input-box">
                <label>
                    <input class="input" placeholder="请确认您的新密码">
                </label>
            </div>
        </div>
        <div style="margin-top: 20px">
            <button class="button-submit find-password-box-width">下一步</button>
        </div>
    </div>
        <div class="find-password-card">
            <div style="margin-top: 20px">
                <button class="button-submit find-password-box-width">下一步</button>
            </div>
        </div>
    </div>
</main>

<script type="text/javascript" language="JavaScript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/find-password-card.js"></script>
</body>
</html>
