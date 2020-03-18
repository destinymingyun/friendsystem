package com.paqi.friendsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author paqi
 * @Description
 * @Date 上午12:40 16/3/2020
 * @version 1.1.0
**/
@Controller
@RequestMapping("/view")
public class ViewController {
    /**
     * @Description 主页映射
     * @Date 上午12:50 16/3/2020
     * @version 1.1.0
    **/
    @GetMapping("/index")
    public String index() {
        return "./index";
    }

    /**
     * @author PQ
     * @Description 登录业映射
     * @Date 下午4:42 16/3/2020
     * @version 2.2.0
    **/
    @GetMapping("/login")
    public String login() {
        return "./login";
    }

    /**
     * @author PQ
     * @Description 注册映射
     * @Date 下午4:43 16/3/2020
     * @version 2.2.0
    **/
    @GetMapping("/register")
    public String register() {
        return "./register";
    }

    /**
     * @author PQ
     * @Description 登录页映射
     * @Date 13:54 18/3/2020
     * @version 3.4.0
    **/
    @GetMapping("/user-info")
    public String userInfo() {
        return "./user-info";
    }
    
    /**
     * @author PQ
     * @Description 文章页映射
     * @Date 14:27 18/3/2020
     * @version 3.4.1
    **/
    @GetMapping("/literature")
    public String literature() {
        return "./literature";
    }
}
