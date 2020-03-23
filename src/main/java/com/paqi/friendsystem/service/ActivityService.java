package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.Activity;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 活动服务接口
 * @Date 16:32 23/3/2020
 * @version 3.4.25
**/
public interface ActivityService {
    /**
     * 添加活动
     * @author PQ
     * @Description 添加一个新活动
     * @param activity：活动
     * @version 返回true则添加成功，否则返回失败
     * @Date 16:33 23/3/2020
     * @version 3.4.25
    **/
    boolean addActivity(Activity activity);

    /**
     * @author PQ
     * @Description 查询所有活动
     * @return 返回活动
     * @Date 17:03 23/3/2020
     * @version 3.4.25
    **/
    ArrayList<Activity> selectAllActivity();

    /**
     * @author PQ
     * @Description 删除一个活动
     * @Date 17:10 23/3/2020
     * @version 3.4.25
    **/
    boolean deleteActivity(int activityId);
}
