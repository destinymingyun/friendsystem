package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.Fun;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author PQ
 * @Description funMapper测试
 * @Date 下午1:33 17/3/2020
 * @version 3.2.0
**/
@SpringBootTest
public class FunMapperTest {
    @Autowired
    private FunMapper funMapper;

    /**
     * @author PQ
     * @Description 测试能否创建兴趣圈
     * @Date 下午1:35 17/3/2020
     * @version 3.2.0
    **/
    @Test
    public void testPostFun() {
        Fun fun = new Fun();
        fun.setBuilderId(5);
        fun.setFunName("测试兴趣部落");
        fun.setLiteratureNum(0);
        fun.setMemberNum(1);
        fun.setCreateTime(new Date());
        int ret = funMapper.postFun(fun);
        Assertions.assertEquals(1, ret);
    }

    /**
     * @author PQ
     * @Description 测试更新拥有者id
     * @Date 下午10:59 17/3/2020
     * @version 3.3.0
    **/
    @Test
    public void testPutOwnerId() {
        int oldUserId = 5;
        int newUserId = 6;
        int funId = 2;
        int ret = funMapper.putOwnerIdByOldOwnerIdAndFunId(oldUserId, newUserId, funId);
        Assertions.assertNotEquals(0, ret);
    }

    /**
     * @author PQ
     * @Description 获取全部兴趣部落
     * @Date 17:55 20/3/2020
     * @version 3.4.14
    **/
    @Test
    public void testGetAll() {
        ArrayList<Fun> funArrayList = funMapper.getAll();
        for(Fun fun : funArrayList) {
            System.out.println("fun = " + fun);
        }
    }
}
