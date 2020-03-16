package com.paqi.friendsystem.mappertest;

import com.paqi.friendsystem.entity.user.UserSafety;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author PQ
 * @Description 测试UserSafetyMapper是否可运行
 * @Date 下午1:22 16/3/2020
 * @version 2.0.4
**/
@SpringBootTest
public class UserSafetyMapperTest {
    @Autowired
    private UserSafetyMapper userSafetyMapper;

    /**
     * @author PQ
     * @Description 测试是否能添加一条数据库记录
     * @Date 下午2:14 16/3/2020
     * @version 2.0.4
    **/
    @Test
    public void testPostUserSafety() {
        UserSafety userSafety = new UserSafety();
        userSafety.setUserId(1);
        userSafety.setQuestion1("q1");
        userSafety.setQuestion2("q2");
        userSafety.setQuestion3("q3");
        userSafety.setAnswer1("a1");
        userSafety.setAnswer2("a2");
        userSafety.setAnswer3("a3");
        int ret = userSafetyMapper.postUserMSafety(userSafety);
        Assertions.assertEquals(1, ret);
    }

    /**
     * @author PQ
     * @Description 测试获取用户安全是否可行
     * @Date 下午2:27 16/3/2020
     * @version 2.0.5
    **/
    @Test
    public void testGetUserSafety() {
        int userId = 1;
        UserSafety userSafety = userSafetyMapper.getUserSafety(userId);
        boolean ret = false;
        if (userSafety != null) {
            ret = true;
        }
        Assertions.assertEquals(true, ret);
    }
}
