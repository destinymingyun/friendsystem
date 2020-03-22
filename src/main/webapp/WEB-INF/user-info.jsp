<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 21/3/2020
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息中心</title>
    <link rel="shortcut icon" type="image/x-icon" href="/static/img/logo.png"/>
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/nav.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/footer.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/author.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/article.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/user-info.css" type="text/css"/>
</head>
<body>
<main>
    <%@include file="/WEB-INF/public/nav.jsp" %>
    <div class="normal-width">
        <header class="user-info">
            <div>
                <h3>我发布过的话题</h3>
            </div>
            <div>
            </div>
        </header>
        <div class="main-panel">
            <section class="literature-list-box">
                <article>
                    <div class="article-title"><h2>{}</h2>
                        <time>12:20:20</time>
                    </div>
                    <div class="article-context">
                        aaaaaaaaaaaaaaaaaaaaaaaaaa
                    </div>
                </article>
            </section>
            <section class="">
                <div class="author-box">
                    <h2>个人信息</h2>
                    <h3>
                        昵称: ${userInfo.userName}
                    </h3>
                    <h3>
                        性别: ${userInfo.sex==0?"女":"男"}
                    </h3>
                    <h3>
                        年龄: ${userInfo.age}
                    </h3>
                    <h3>
                        爱好: ${userInfo.hobby}
                    </h3>
                    <h3>
                        简介: ${userInfo.introduction}
                    </h3>
                </div>
            </section>
        </div>
    </div>
    <%@include file="/WEB-INF/public/footer.jsp" %>
</main>
</body>
</html>
