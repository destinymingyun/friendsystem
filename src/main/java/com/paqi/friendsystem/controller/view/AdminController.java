package com.paqi.friendsystem.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author PQ
 * @Description 管理员
 * @Date 21:04 18/3/2020
 * @version 3.4.4
**/
@Controller
@RequestMapping("/admin")
public class AdminController {
    /**
     * @author PQ
     * @Description 管理员主页
     * @Date 21:48 18/3/2020
     * @version 3.4.4
    **/
    @GetMapping("/index")
    public String adminIndex() {
        return "/admin-index";
    }

    /**
     * @author PQ
     * @Description 用户表页面映射
     * @Date 14:10 19/3/2020
     * @version 3.4.9
    **/
    @GetMapping("/user")
    public String adminUser() {
        return "/admin-user";
    }
}
