<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/23
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin-release</title>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/admin.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/footer.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/admin-nav.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/admin-release.css" type="text/css"/>
</head>
<body>
<div class="panel">
    <%@include file="/WEB-INF/public/admin-nav.jsp" %>
    <main>
        <header>
            <div>你好!${account.account}</div>
        </header>
        <div class="admin-banner">
            <img src="/static/img/admin-banner.jpg">
        </div>
        <section class="main-panel">
            <div class="release-box">
                <div class="activities-theme"><input id="theme" value="请输入要发布的标题"></div>
                <div class="activities-content"><input id="content" value="请输入要发布的内容"></div>
                <div class="activities-button"><input id="button" type="submit" value="提交"></div>
            </div>
        </section>
        <%@include file="/WEB-INF/public/footer.jsp" %>
    </main>
</div>
<script type="text/javascript" language="JavaScript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/service/activityService.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        getActivity(function () {
            alert("输出成功")
        });
        $(".activities-button").click(function () {
            var name = $("#theme").val();
            var context = $("#content").val();
            var activities = {"name": name, "context": context}
            addActivity(activities,function () {
                alert("添加成功")
            });
        });
    });
</script>
</body>
</html>
