<%--
  Created by IntelliJ IDEA.
  User: destiny
  Date: 18/3/2020
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<nav class="main-nav">
    <ul>
        <li><img src="/static/img/logo.png"><span>交友管理系统</span></li>
        <div class="sub-nav">
            <li>账号管理</li>
            <a href="">
                <li>查询用户信息</li>
            </a>
            <a href="/admin/user">
                <li>修改用户信息</li>
            </a>
        </div>
        <div class="sub-nav">
            <li>话题管理</li>
            <a href="/admin/literature">
                <li>待审核话题</li>
            </a>
            <a href="">
                <li>修改话题状态</li>
            </a>
            <a href="">
                <li>删除指定评论</li>
            </a>
        </div>
        <div class="sub-nav">
            <li>活动管理</li>
            <a href="">
                <li>正在进行活动</li>
            </a>
            <a href="">
                <li>活动管理</li>
            </a>
        </div>
    </ul>
</nav>
</html>
