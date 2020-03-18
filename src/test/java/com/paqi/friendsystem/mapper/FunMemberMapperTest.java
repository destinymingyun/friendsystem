package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.relation.FunMember;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author PQ
 * @Description FunMemberMapper测试类
 * @Date 下午9:38 17/3/2020
 * @version 3.3.0
**/
@SpringBootTest
public class FunMemberMapperTest {
    @Autowired
    private FunMemberMapper funMemberMapper;
    /**
     * @author PQ
     * @Description 测试添加一条关系
     * @Date 下午9:40 17/3/2020
     * @version 3.3.0
    **/
    @Test
    public void testPostFunMember() {
        FunMember funMember = new FunMember();
        funMember.setFunId(1);
        funMember.setMemberId(5);
        int ret = funMemberMapper.postFunMember(funMember);
        Assertions.assertNotEquals(0, ret);
    }

    /**
     * @author PQ
     * @Description 删除一条对应关系测试
     * @Date 10:28 18/3/2020
     * @version 3.3.2
    **/
    @Test
    public void testDeleteFunMember() {
        FunMember funMember = new FunMember();
        funMember.setFunId(2);
        funMember.setMemberId(5);
        int ret = funMemberMapper.deleteFunMember(funMember);
        Assertions.assertEquals(1, ret);
    }
}
