package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.user.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author PQ
 * @Description 普通用户服务测试
 * @Date 下午3:44 16/3/2020
 * @version 2.1.0
**/
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    /**
     * @author PQ
     * @Description 测试登录
     * @Date 下午3:45 16/3/2020
     * @version 2.1.0
    **/
    @Test
    public void testLogin() {
        Account account = new Account();
        account.setAccount("test1");
        account.setPassword("test");
        int userId = userService.login(account);
        Assertions.assertEquals(1,userId);
    }
}
