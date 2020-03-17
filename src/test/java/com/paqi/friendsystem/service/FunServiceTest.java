package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.Fun;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author PQ
 * @Description FunServiceTest
 * @Date 下午10:10 17/3/2020
 * @version 3.3.0
**/
@SpringBootTest
public class FunServiceTest {
    @Autowired
    private FunService funService;

    /**
     * @author PQ
     * @Description 测试部落创建服务
     * @Date 下午10:14 17/3/2020
     * @version 3.3.0
    **/
    @Test
    public void createFunTest() {
        Fun fun = new Fun();
        fun.setBuilderId(5);
        fun.setFunName("测试兴趣部落");
        fun.setLiteratureNum(0);
        fun.setMemberNum(1);
        fun.setCreateTime(new Date());
        int funId = funService.createFun(fun);
        Assertions.assertNotEquals(0 ,funId);
    }
}
