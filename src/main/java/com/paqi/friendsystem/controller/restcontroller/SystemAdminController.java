package com.paqi.friendsystem.controller.restcontroller;

import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 管理员操作控制器
 * @Date 15:17 20/3/2020
 * @version 3.4.13
**/
@RestController
@RequestMapping("/api/admin")
public class SystemAdminController {
    @Autowired
    private UserService userService;

    /**
     * @author PQ
     * @Description 返回全部用户(非管理员)
     * @Date 14:28 20/3/2020
     * @version 3.4.13
     **/
    @GetMapping("/users")
    public ArrayList<Account> getUsers() {
        ArrayList<Account> accountList = userService.getUsers(1);
        System.out.println(accountList.size());
        for (Account account : accountList) {
            account.setPassword("");
            System.out.println("account = " + account);
        }
        return accountList;
    }
}
