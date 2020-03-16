package com.paqi.friendsystem.mappertest;

import com.paqi.friendsystem.entity.user.Account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author PQ
 * @Description 账号测试类
 * @Date 上午2:43 16/3/2020
 * @version 2.0
**/
@SpringBootTest
public class AccountMapperTest {
    @Autowired
    private AccountMapper accountMapper;

    /**
     * @author PQ
     * @Description 测试插入语句是否正确
     * @Date 上午2:44 16/3/2020
     * @version 2.0
    **/
    @Test
    public void testPostAccount() {
        Account account = new Account();
        account.setAccount("test1");
        account.setPassword("test");
        account.setUserType(1);
        int ret = accountMapper.postAccount(account);
        Assertions.assertEquals( 1, ret);
    }

    /**
     * @author PQ
     * @Description 测试根据账户或密码查询是否正确
     * @Date 上午11:34 16/3/2020
     * @version 2.0.1
    **/
    @Test
    public void testGetUserIdByAccountAndPassword() {
        Account account = new Account();
        account.setAccount("test1");
        account.setPassword("test");
        account.setUserType(1);
        int userId = accountMapper.getUserIdByAccountAndPassword(account);
        Assertions.assertEquals(1, userId);
    }
}
