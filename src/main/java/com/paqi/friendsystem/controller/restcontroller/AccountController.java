package com.paqi.friendsystem.controller.restcontroller;

import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.entity.user.UserInfo;
import com.paqi.friendsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author PQ
 * @Description 账户api相关控制
 * @Date 20:35 19/3/2020
 * @version 3.4.11
**/
@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired
    private UserService userService;
    /**
     * @author PQ
     * @Description 登录接口
     * @Date 20:37 19/3/2020
     * @version 3.4.11
    **/
    @PostMapping("/login")
    public int login(@RequestBody Account account, HttpServletRequest httpServletRequest) {
        Account dbAccount = userService.loginAccount(account);
        if (dbAccount == null) {
            return 0;
        } else {
            httpServletRequest.getSession().setAttribute("account", account);
            return dbAccount.getUserType();
        }
    }

    /**
     * @author PQ
     * @Description 检查账户是否有重复
     * @Date 23:29 19/3/2020
     * @version 3.4.11
    **/
    @GetMapping("/repeat-account")
    public boolean checkAccount(String account) {
        System.out.println("account = " + account);
        return userService.checkAccountRepeat(account);
    }

    /**
     * @author PQ
     * @Description 注册账号
     * @Date 14:26 20/3/2020
     * @version 3.4.11
    **/
    @PostMapping("/register")
    public int register(@RequestBody  Map<String,Object> map) {
        Account account = new Account();
        account.setAccount((String)map.get("account"));
        account.setPassword((String)map.get("password"));
        account.setStatus(1);
        account.setUserType(1);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName((String)map.get("userName"));
        userInfo.setSex(Integer.parseInt((String)map.get("sex")));
        return userService.registerAccount(account, userInfo);
    }
}
