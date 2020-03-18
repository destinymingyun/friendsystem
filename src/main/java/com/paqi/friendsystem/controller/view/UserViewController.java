package com.paqi.friendsystem.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author PQ
 * @Description 用户controller
 * @Date 21:03 18/3/2020
 * @version 3.4.4
**/
@Controller
@RequestMapping("/user")
public class UserViewController {
    /**
     * @author PQ
     * @Description 修改密码映射
     * @Date 21:09 18/3/2020
     * @version 3.4.4
    **/
    @GetMapping("/change-password")
    public String changePassword() {
        return "./change-password";
    }

    /**
     * @author PQ
     * @Description 个人信息页面
     * @Date 21:46 18/3/2020
     * @version 3.4.4
    **/
    @GetMapping("/user-info")
    public String userInfo() {
        return "./user-info";
    }
}
