package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.Fun;

/**
 * @author PQ
 * @Description 兴趣部落接口
 * @Date 下午10:02 17/3/2020
 * @version 3.3.0
**/
public interface FunService {
    /**
     * 创建一个兴趣部落
     * @author PQ
     * @Description 创建一个兴趣部落
     * @param fun：兴趣实体基本信息
     * @return 返回兴趣部落的id
     * @Date 下午10:08 17/3/2020
     * @version 3.3.0
    **/
    int createFun(Fun fun);
}
