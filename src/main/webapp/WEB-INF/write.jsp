<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 20/3/2020
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>撰写文章</title>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/nav.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/footer.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/writer.css" type="text/css"/>
</head>
<body>
<main>
    <%@include file="/WEB-INF/public/nav.jsp" %>
    <section class="write-box normal-width">
        <form method="post" action="/">
            <div class="container">
                <div class="container-header">
                    <label class="write-index-title-input">
                        <textarea class="input1" placeholder="请输入标题（最多30字）"></textarea>
                    </label>
                </div>
                <div class="editable-toolbar-controls">
                    <hr color="grey">
                    <span>快提出一个话题吧！</span>
                    <div class="button">
                        <button id="save-button" class="button-editable"><img class="button-img" src="/static/icon/baocun.png"></button>
                    </div>
                    <div class="button">
                        <button class="button-editable"><img class="button-img" src="/static/icon/bold.png"></button>
                    </div>
                    <div class="button">
                        <button class="button-editable"><img class="button-img" src="/static/icon/shanchu.png"></button>
                    </div>
                    <div class="button">
                        <button class="button-editable"><img class="button-img" src="/static/icon/tupian.png"></button>
                    </div>
                    <div class="button">
                        <button class="button-editable"><img class="button-img" src="/static/icon/zitidaima.png">
                        </button>
                    </div>
                    <hr color="grey">
                </div>
                <div class="editable-content">
                    <div class="essay-content">
                        <label class="essay-content-input">
                            <textarea class="input2" placeholder="请输入正文"></textarea>
                        </label>
                    </div>
                </div>
            </div>
        </form>
    </section>
    <%@include file="/WEB-INF/public/footer.jsp" %>
</main>
<script type="text/javascript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
</body>
</html>
