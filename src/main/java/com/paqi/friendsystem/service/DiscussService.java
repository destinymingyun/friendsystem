package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.Discuss;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 评论服务接口
 * @Date 下午8:34 17/3/2020
 * @version 3.3.0
**/
public interface DiscussService {
    /**
     * 添加一条新评论
     * @author PQ
     * @Description 添加一条新评论
     * @param discuss：评论实体类
     * @return 返回添加成功的评论id
     * @Date 下午8:35 17/3/2020
     * @version 3.3.0
    **/
    int addDiscuss(Discuss discuss);

    /**
     * 根据文章id获取评论列表
     * @author PQ
     * @Description 根据文章id获取评论
     * @param literatureId：文章id
     * @return 返回评论列表
     * @Date 17:17 22/3/2020
     * @version
    **/
    ArrayList<Discuss> getDiscussList(int literatureId);
}
