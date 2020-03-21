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
    <link rel="stylesheet" href="/static/css/reset.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/nav.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/normal.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/footer.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/literature-list.css" type="text/css"/>
    <link rel="stylesheet" href="/static/css/fun-box.css" type="text/css"/>
</head>
<body>
<main>
    <%@include file="/WEB-INF/public/nav.jsp" %>
    <section class="fun-box normal-width">
        <ul id="fun"></ul>
    </section>
    <section class="literature-list-box normal-width" id="literature-box">
        <header>
            <h1 id="fun-name"> </h1>
            <data id="people-num"> </data>
        </header>
    </section>
    <%@include file="/WEB-INF/public/footer.jsp" %>
</main>
<script type="text/javascript" language="JavaScript" src="/webjars/jquery/3.4.1/dist/jquery.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/service/funService.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/service/literatureService.js"></script>
<script type="text/javascript" language="JavaScript" src="/static/js/literature-list.js"></script>
<script type="text/javascript" language="JavaScript">
    $(document).ready(function () {
        getFun(function (list) {
            funForeach(list)
        })
    })
</script>
</body>
</html>
