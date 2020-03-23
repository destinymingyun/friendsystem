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
</head>
<body>
<%@include file="/WEB-INF/public/nav.jsp" %>
<header>'
    <img id="banner" src="/static/img/banner.png" style="width: 100%; height: 200px">
</header>
<mian>
    <section class="normal-width main-box">
        <div class="literature-box">
            <h1>${literature.title}</h1>
            <hr>
            <div class="context">
                <p>${literature.context}</p>
            </div>
            <hr>
            <div class="discuss-box">
                <div class="discuss-box-title">
                    <h2>评论区</h2>
                    <a href="#">说说我自己的看法</a>
                </div>
                <div class="discusses">
                    <div class="discuss-title">
                        <h4>张三</h4>
                        <div>发表时间: 2019-12-22</div>
                    </div>
                    <hr>
                    <div>这篇文章真的很不错</div>
                </div>
                <a href="#">点击显示更多</a>
            </div>
            <hr>
            <div class="comment-header">
            </div>
            <div class="comment-content">
                <div class="img"><img src="/static/img/male.png"></div>
                <div class="textarea-container">
                    <textarea class="comment-textarea" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
                    <button type="submit" class="button" value="">发表评论</button>
                </div>
            </div>
            <hr>
               <div class="comment-list">
                     <%--<div class="list-item">
                         <div class="span"><span><a>comment_id</a></span></div>
                         <p class="text">我讨厌做系统啊啊啊啊啊啊</p>
                     </div>
                   <hr>--%>
            </div>

        </div>
        <div>
            <div class="author-box">
                <h2>作者信息</h2>
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
        </div>
    </section>

</mian>
<%@include file="/WEB-INF/public/footer.jsp" %>

<script type="text/javascript" language="JavaScript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/service/discussService.js"></script>
<script type="text/javascript" language="JavaScript">
    $(document).ready(function () {
        var url=window.location.href;
        var url = url.substr(40,10);
        var literatureId =parseInt(url)
        alert(literatureId);
        getDiscussList(literatureId,function (list) {
            findAllDiscuss(list);
        })
        });

</script>
</body>
</html>
