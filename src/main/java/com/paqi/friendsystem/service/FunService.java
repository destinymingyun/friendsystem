package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.Fun;
import com.paqi.friendsystem.entity.relation.FunMember;

import java.util.ArrayList;

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

    /**
     * 加入一个兴趣部落
     * @author PQ
     * @Description 加入一个兴趣部落
     * @param funMember：兴趣部落对应关系
     * @return 若成功则返回该兴趣部落id
     * @Date 10:34 18/3/2020
     * @version 3.3.2
    **/
    int joinFun(FunMember funMember);

    /**
     * 退出某个兴趣部落
     * @author PQ
     * @Description 退出兴趣部落
     * @param funMember：原有一条映射关系
     * @return 返回是否退出成功，成功为true，失败为false
     * @Date 10:30 18/3/2020
     * @version 3.3.2
    **/
    boolean exitFun(FunMember funMember);

    /**
     * @author PQ
     * @Description 获取全部兴趣
     * @Date 17:35 20/3/2020
     * @version 3.4.14
    **/
    ArrayList<Fun> getAllFun();

    /**
     * @author PQ
     * @Description
     * @Date 15:36 22/3/2020
     * @version 
    **/
    boolean changeFunintroduction(String introduction, int funId);
}
