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

    /**
     * 更改兴趣部落拥有者
     * @author PQ
     * @Description 更改兴趣部落拥有者
     * @param newOwnerId:新拥有者id
     * @param oldOwner：旧拥有者id
     * @param funId：兴趣部落id
     * @return 返回是否更改成功
     * @Date 上午12:23 18/3/2020
     * @version 3.3.1
    **/
    boolean changeOwner(int newOwnerId, int oldOwner, int funId);
}
