<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 16/3/2020
  Time: 上午12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>帕绮交友网</title>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png" />
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/nav.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/head.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/footer.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/index-main.css" type="text/css"/>
</head>
<body>
<%@include file="/WEB-INF/public/nav.jsp" %>
<!--头部分-->
<header class="banner">
    <img id="banner" src="/static/img/banner1.jpg">
    <div>
        <img src="/static/img/arrows.png">
    </div>
    <div>
        <img id="img" src="/static/img/arrows.png">
    </div>
</header>
<main class="main">
    <section class="activities">
        <div class="normal-width">
            <div class="activities-title">
                <h2>当前正在进行的活动</h2>
                <h6>距离活动目标还有3天开始</h6>
            </div>
        </div>
        <div class="activities-card-box normal-width">
            <div class="card">
                <div><img src="/static/img/logo.png"></div>
                <div class="context">
                    <h3><a href="#">活动甲</a></h3>
                    <p>这是活动甲
                    </p>
                </div>
            </div>
            <div class="card">
                <div><img src="/static/img/logo.png"></div>
                <div class="context">
                    <h3><a href="#">活动乙</a></h3>
                    <p>这是活动乙
                    </p>
                </div>
            </div>
            <div class="card">
                <div><img src="/static/img/logo.png"></div>
                <div class="context">
                    <h3><a href="#">活动3</a></h3>
                    <p>这是活动3
                    </p>
                </div>
            </div>
            <div class="card">
                <div><img src="/static/img/logo.png"></div>
                <div class="context">
                    <h3><a href="#">活动4</a></h3>
                    <p>这是活动4
                    </p>
                </div>
            </div>
            <div class="card">
                <div><img src="/static/img/logo.png"></div>
                <div class="context">
                    <h3><a href="#">活动5</a></h3>
                    <p>这是活动5
                    </p>
                </div>
            </div>
            <div class="card">
                <div><img src="/static/img/logo.png"></div>
                <div class="context">
                    <h3><a href="#">活动6</a></h3>
                    <p>这是活动6
                    </p>
                </div>
            </div>
        </div>
    </section>
</main>
<%@include file="/WEB-INF/public/footer.jsp" %>
<script src="/static/js/index-banner.js" type="text/javascript"></script>
<script>
    window.onload = indexBanner();
</script>
</body>
</html>
