package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.Literature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author PQ
 * @Description 文章测试类
 * @Date 下午1:10 17/3/2020
 * @version 3.2.0
**/
@SpringBootTest
public class LiteratureMapperTest {
    @Autowired
    private LiteratureMapper literatureMapper;

    /**
     * @author PQ
     * @Description 文章测试类
     * @Date 下午1:11 17/3/2020
     * @version 3.2.0
    **/
    @Test
    public void testPostLiterature() {
        Literature literature = new Literature();
        literature.setAuthorId(5);
        literature.setContext("Hello World");
        literature.setFunId(1);
        literature.setTitle("this is title");
        literature.setCreateTime(new Date());
        int ret = literatureMapper.postLiterature(literature);
        Assertions.assertEquals(1, ret);
    }

    /**
     * @author PQ
     * @Description 测试删除文章
     * @Date 下午8:23 17/3/2020
     * @version 3.3.0
     **/
    @Test
    public void testDeleteLiteratureService() {
        int literatureId = 12;
        int ret = literatureMapper.deleteLiterature(literatureId);
        Assertions.assertNotEquals(0, ret);
    }
}
