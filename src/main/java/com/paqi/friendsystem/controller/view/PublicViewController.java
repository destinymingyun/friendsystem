package com.paqi.friendsystem.controller.view;

import com.paqi.friendsystem.entity.Literature;
import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.entity.user.UserInfo;
import com.paqi.friendsystem.mapper.LiteratureMapper;
import com.paqi.friendsystem.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/**
 * @author PQ
 * @Description 公共视图controller
 * @Date 21:00 18/3/2020
 * @version 3.4.4
**/
@Controller
@RequestMapping("/public")
public class PublicViewController {
    @Autowired
    private LiteratureMapper literatureMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
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
    @GetMapping("/literature/{literatureId}")
    public ModelAndView literature(@PathVariable int literatureId, HttpServletRequest httpServletRequest) {
        ModelAndView modelAndView = new ModelAndView("/literature");
        Literature literature = literatureMapper.getLiteratureById(literatureId);
        Literature literature1 = new Literature();
        literature1.setTitle("页面出错啦！！！");
        literature1.setContext("该话题不存在或您无权访问，请登录后试试？");
//        Account account = (Account)(httpServletRequest.getSession().getAttribute("account"));
        Account account = new Account();
        account.setUserType(2);
        account.setUserType(2);
        account.setUserId(5);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("");
        userInfo.setAge(0);
        userInfo.setSex(0);
        userInfo.setHobby("");
        userInfo.setIntroduction("");
        if (literature == null || literature.getStatus() == 0) {
            System.out.println("错误1");
            modelAndView.addObject("literature", literature1);
        }
        if (account.getUserType() == 1 && literature.getStatus() == 0 && account.getUserId() != literature.getAuthorId()) {
            System.out.println("错误2");
            modelAndView.addObject("literature", literature1);
        } else {
            System.out.println("正确");
            modelAndView.addObject("literature", literature);
            userInfo = userInfoMapper.getUserInfoById(account.getUserId());
        }
        modelAndView.addObject("userInfo", userInfo);
        return modelAndView;
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
