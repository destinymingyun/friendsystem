package com.paqi.friendsystem.service.impl;

import com.paqi.friendsystem.entity.Discuss;
import com.paqi.friendsystem.mapper.DiscussMapper;
import com.paqi.friendsystem.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 评论服务类
 * @Date 15:03 23/3/2020
 * @version 3.4.25
**/
@Service
public class DiscussServiceImpl implements DiscussService {
    @Autowired
    private DiscussMapper discussMapper;

    /**
     * @author PQ
     * @Description
     * @param discuss:评论实体
     * @Date 15:04 23/3/2020
     * @version 3.4.25
    **/
    @Override
    public int addDiscuss(Discuss discuss) {
        return discussMapper.postDiscuss(discuss);
    }

    /**
     * @author PQ
     * @Description 根据文章获取实体
     * @Date 15:04 23/3/2020
     * @version 3.4.25
    **/
    @Override
    public ArrayList<Discuss> getDiscussList(int literatureId) {
        return discussMapper.getDiscussByLiteratureId(literatureId);
    }
}
