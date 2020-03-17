package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.Literature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author PQ
 * @version 3.3.0
 * @Description 文章服务测试
 * @Date 下午6:54 17/3/2020
 **/
@SpringBootTest
public class LiteratureServiceTest {
    @Autowired
    private LiteratureService literatureService;

    /**
     * @author PQ
     * @Description 测试添加文章
     * @Date 下午7:59 17/3/2020
     * @version 3.3.0
     **/
    @Test
    public void testAddLiteratureService() {
        Literature literature = new Literature();
        literature.setAuthorId(5);
        literature.setContext("Hello Service");
        literature.setFunId(1);
        literature.setTitle("this is title");
        literature.setCreateTime(new Date());
        int ret = literatureService.addLiterature(literature);
        Assertions.assertNotEquals(0, literature);
    }
}
