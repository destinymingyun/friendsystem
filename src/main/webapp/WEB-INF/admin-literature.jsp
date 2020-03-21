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
            <div>你好!${account.account}</div>
        </header>
        <div class="admin-banner">
            <img src="/static/img/admin-banner.jpg">
        </div>
        <section class="main-panel">
            <table class="table">
                <thead>
                <tr>
                    <th>待审核话题id</th>
                    <th>话题题目</th>
                    <th>话题链接</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody id="tbody">
                </tbody>
            </table>
        </section>
        <%@include file="/WEB-INF/public/footer.jsp" %>
    </main>
</div>
<script type="text/javascript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/service/adminService.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/service/literatureService.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/selectAllLiterature.js"></script>
<script type="text/javascript">
    window.onload = function () {
        var data = {
            "status": 1
        }
        getLiteratureByStatus(data, function (list) {
            selectAllLiterature(list);
        });
    }
</script>
</body>
</html>