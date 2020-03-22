<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 18/3/2020
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章</title>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/nav.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/footer.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/literature.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/author.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/article.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/literature-write.css" type="text/css"/>
</head>
<body>
<%@include file="/WEB-INF/public/nav.jsp" %>
<header>'
    <img id="banner" src="/static/img/banner.png" style="width: 100%; height: 200px">
</header>
<mian>
    <section class="normal-width main-box">
        <div class="write-comment">
            <div class="commentName"><h4>commentName</h4></div>
            <div class="commentContent"><h5><input value="请输入评论内容"></h5></div>
            <div class="commentButton">
                <Button>提交评论</Button>
            </div>
        </div>
    </section>

</mian>
<%@include file="/WEB-INF/public/footer.jsp" %>
</body>
</html>
