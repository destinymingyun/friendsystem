package com.paqi.friendsystem.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author PQ
 * @Description 公共视图controller
 * @Date 21:00 18/3/2020
 * @version 3.4.4
**/
@Controller
@RequestMapping("/public")
public class PublicViewController {
    /**
     * @author PQ
     * @Description 映射主页
     * @Date 21:09 18/3/2020
     * @version 3.4.4
    **/
    @GetMapping("/index")
    public String index() {
        return "./index";
    }

    /**
     * @author PQ
     * @Description 文章视图映射
     * @Date 21:10 18/3/2020
     * @version 3.4.4
    **/
    @GetMapping("/literature")
    public String literature() {
        return "./literature";
    }

    /**
     * @author PQ
     * @Description 登录页面映射
     * @Date 21:44 18/3/2020
     * @version 3.4.4
    **/
    @GetMapping("/login")
    public String login() {
        return "./login";
    }

    /**
     * @author PQ
     * @Description 注册页面映射
     * @Date 21:47 18/3/2020
     * @version 3.4.4
    **/
    @GetMapping("/register")
    public String register() {
        return "./register";
    }

    /**
     * @author PQ
     * @Description 文章列表页面映射
     * @Date 02:06 19/3/2020
     * @version 3.4.8
    **/
    @GetMapping("/literature-list")
    public String literatureList() {
        return "/literature-list";
    }

    /**
     * @author PQ
     * @Description 找回密码
     * @Date 15:40 19/3/2020
     * @version 3.4.10
    **/
    @GetMapping("/find-password")
    public String findPassword() {
        return "/find-password";
    }
}
