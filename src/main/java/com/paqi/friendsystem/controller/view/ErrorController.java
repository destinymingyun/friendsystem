package com.paqi.friendsystem.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author PQ
 * @Description 错误处理视图controller
 * @Date 21:03 18/3/2020
 * @version 3.4.4
**/
@Controller
@RequestMapping("/error")
public class ErrorController {
    /**
     * @author PQ
     * @Description 404错误
     * @Date 00:49 19/3/2020
     * @version 3.4.7
    **/
    @GetMapping("/404")
    public String error404() {
        return "/public/404";
    }
}
