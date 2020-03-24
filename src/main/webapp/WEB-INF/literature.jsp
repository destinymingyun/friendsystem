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
<%--            <div class="discuss-box">--%>
<%--            <div class="discuss-box-title">--%>
<%--                <h2>评论区</h2>--%>
<%--                <a href="#">说说我自己的看法</a>--%>
<%--            </div>--%>
<%--            &lt;%&ndash;                <div class="discusses">&ndash;%&gt;--%>
<%--            &lt;%&ndash;                    <div class="discuss-title">&ndash;%&gt;--%>
<%--            &lt;%&ndash;                        <h4>张三</h4>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                        <div>发表时间: 2019-12-22</div>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                    </div>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                    <hr>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                    <div>这篇文章真的很不错</div>&ndash;%&gt;--%>
<%--            &lt;%&ndash;                </div>&ndash;%&gt;--%>
<%--            <a href="#">点击显示更多</a>--%>
<%--        </div>--%>
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
            <div class="list" id="list">
                <%--                <div class="comment-list">
                                    <div class="list-item">
                                        <div class="span"><span>用户：<a>王五</a></span></div>
                                        <p class="text">如何可以完成毕业设计，我太难了</p>
                                    </div>
                                </div>--%>
            </div>
            <hr>
        </div>
        <div>
            <div class="author-box">
                <h2>作者信息</h2>
                <h3>
                    昵称: ${authorInfo.userName}
                </h3>
                <h3>
                    性别: ${authorInfo.sex==0?"女":"男"}
                </h3>
                <h3>
                    年龄: ${authorInfo.age}
                </h3>
                <h3>
                    爱好: ${authorInfo.hobby}
                </h3>
                <h3>
                    简介: ${authorInfo.introduction}
                </h3>
            </div>
        </div>
    </section>

</mian>
<%@include file="/WEB-INF/public/footer.jsp" %>

<script type="text/javascript" language="JavaScript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/service/discussService.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/findAllDiscuss.js"></script>
<script type="text/javascript" language="JavaScript">
    $(document).ready(function () {
        var url=window.location.href;
        var url = url.substr(40,10);
        var literatureId =parseInt(url)
        getDiscussList({"literatureId": literatureId},function (list) {
            console.log(list)
            findAllDiscuss(list);
        })
        var discuss = {
            "literatureId": literatureId,
            "context": "context"
        }
        $(".button").click(function (discuss) {
            writeDiscuss(discuss,function (boolean) {
                alert(literatureId);
            });
        });
        });



</script>
</body>
</html>
