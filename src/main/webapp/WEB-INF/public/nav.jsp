<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 18/3/2020
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<nav class="nav">
    <div class="nav-box normal-width">
        <div class="logo"><img src="/static/img/logo.png"></div>
        <div class="nav-item">
            <ul>
                <li><a class="active" href="#">当前活动</a></li>
                <li><a href="/public/literature-list">兴趣部落</a></li>
                <li><a href="/api/literature/write">创建话题</a></li>
                <li><a href="${account.account==null?"/public/login":"#"}">
                    ${account.account==null?"登录":"你好"+account.account}
                </a></li>
            </ul>
        </div>
    </div>
</nav>
<%--<script type="text/javascript" language="JavaScript" src="/static/js/nav.js"></script>--%>
</html>
