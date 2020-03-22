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

    /**
     * @author PQ
     * @Description 撰写文章
     * @Date 13:05 20/3/2020
     * @version 3.4.12
    **/
    @GetMapping("/write")
    public String write() {
        return "./write";
    }

    /**
     * @author PQ
     * @Description 创建部落页面
     * @Date 13:42 22/3/2020
     * @version 3.4.22
    **/
    @GetMapping("/create-fun")
    public String createFun(){return "./create-fun";}

    /**
     * @author PQ
     * @Description
     * @Date 13:42 22/3/2020
     * @version 3.4.22
    **/
    @GetMapping("/alter-fun")
    public String alterFun(){return "./alter-fun";}

    /**
     * @author PQ
     * @Description 关注部落
     * @Date 13:43 22/3/2020
     * @version 3.4.22
    **/
    @GetMapping("/join-fun")
    public String joinFun(){return "./join-fun";};

    /**
     * @author PQ
     * @Description 转让部落
     * @Date 13:43 22/3/2020
     * @version 3.4.22
    **/
    @GetMapping("/transfer-fun")
    public String transferFun(){return "./transfer-fun";}

    @GetMapping("/literature-write")
    public String literatureWrite(){return "./literature-write";}
}
