package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.entity.user.UserInfo;
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

    /**
     * @author PQ
     * @Description
     * @Date 下午4:16 16/3/2020
     * @version 2.1.1
    **/
    @Test
    public void testRegister() {
        Account account = new Account();
        account.setAccount("test2");
        account.setPassword("test");
        account.setUserType(1);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("PQ");
        userInfo.setAge(22);
        userInfo.setHobby("羽毛球");
        userInfo.setIntroduction("一个漂亮的小姑凉");
        userInfo.setJob("学生");
        userInfo.setRealName("唐帕绮");
        userInfo.setSex(1);
        int userId = userService.registerAccount(account,userInfo);
        Assertions.assertEquals(1, userId);
    }

    /**
     * @author PQ
     * @Description 测试账号重复检查服务是否可用
     * @Date 下午4:32 16/3/2020
     * @version 2.1.1
    **/
    @Test
    public void testAccountRepeat() {
        String account = "test1";
        boolean ret = userService.checkAccountRepeat(account);
        Assertions.assertEquals(true, ret);
    }

    /**
     * @author PQ
     * @Description 测试修改密码是否可用
     * @Date 上午12:48 18/3/2020
     * @version 3.3.1
    **/
    @Test
    public void testChangePassword() {
        String account = "test1";
        String oldPassword = "test";
        String newPassword = "test1";
        boolean ret = userService.changePassword(account, oldPassword, newPassword);
        Assertions.assertEquals(true, ret);
    }
}
