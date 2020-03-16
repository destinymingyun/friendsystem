package com.paqi.friendsystem.mappertest;

import com.paqi.friendsystem.entity.user.UserInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author PQ
 * @Description 测试UserInfoMapper是否可用
 * @Date 上午11:57 16/3/2020
 * @version 2.0.2
**/
@SpringBootTest
public class UserInfoMapperTest {
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * @author PQ
     * @Description 测试新增用户是否可用
     * @Date 下午12:00 16/3/2020
     * @version 2.0.2
    **/
    @Test
    public void testPostUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(1);
        userInfo.setUserName("PQ");
        userInfo.setAge(22);
        userInfo.setHobby("羽毛球");
        userInfo.setIntroduction("一个漂亮的小姑凉");
        userInfo.setJob("学生");
        userInfo.setRealName("唐帕绮");
        userInfo.setSex(true);

        int ret = userInfoMapper.postUserInfo(userInfo);
        Assertions.assertEquals(ret, 1);
    }

    @Test
    public void testGetUserInfoById() {
        int userId = 1;
        UserInfo userInfo = userInfoMapper.getUserInfoById(userId);
        boolean ret = false;
        if (userInfo != null) {
            ret = true;
        }
        Assertions.assertEquals(true, ret);
    }
}
