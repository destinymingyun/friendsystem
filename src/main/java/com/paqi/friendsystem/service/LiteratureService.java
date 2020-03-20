package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.Literature;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 文章服务类
 * @Date 下午6:31 17/3/2020
 * @version 3.2.0
**/
public interface LiteratureService {
    /**
     * 添加一篇文章
     * @author PQ
     * @Description 填一篇文章
     * @param literature：文章
     * @return 返回该文章的id
     * @Date 下午6:36 17/3/2020
     * @version 3.2.0
    **/
    int addLiterature(Literature literature);

    /**
     * 删除一篇文章
     * @author PQ
     * @Description 删除一篇文章
     * @param literatureId：文章id
     * @return 若删除返回true，否则返回false
     * @Date 下午9:26 17/3/2020
     * @version 3.3.0
    **/
    boolean deleteLiterature(int literatureId);

    /**
     * 根据部落id查询该部落所有文章
     * @author PQ
     * @Description 查询某兴趣全部文章
     * @param funId：文章id
     * @return 文章列表
     * @Date 13:45 20/3/2020
     * @version 3.4.13
    **/
    ArrayList<Literature> getAllLiteratureInFun(int funId);
}
