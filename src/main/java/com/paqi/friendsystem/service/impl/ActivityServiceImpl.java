package com.paqi.friendsystem.service.impl;

import com.paqi.friendsystem.entity.Activity;
import com.paqi.friendsystem.mapper.ActivityMapper;
import com.paqi.friendsystem.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 活动服务类
 * @Date 16:38 23/3/2020
 * @version 3.4.25
**/
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityMapper activityMapper;

    /**
     * @author PQ
     * @Description 添加一个活动
     * @Date 16:38 23/3/2020
     * @version 3.4.25
    **/
    @Override
    public boolean addActivity(Activity activity) {
        int ret = activityMapper.postActivity(activity);
        if (ret == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @author PQ
     * @Description 查询所有活动
     * @Date 17:04 23/3/2020
     * @version 3.4.25
    **/
    @Override
    public ArrayList<Activity> selectAllActivity() {
        return activityMapper.getAllActivity();
    }

    /**
     * @author PQ
     * @Description 删除一个活动
     * @Date 17:10 23/3/2020
     * @version 3.4.25
    **/
    @Override
    public boolean deleteActivity(int activityId) {
        int ret = activityMapper.deleteActivityById(activityId);
        if (ret == 0) {
            return false;
        } else {
            return true;
        }
    }
}
