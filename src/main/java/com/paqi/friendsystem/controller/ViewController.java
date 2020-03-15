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
}
