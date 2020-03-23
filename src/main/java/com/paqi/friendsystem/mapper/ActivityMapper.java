package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.Activity;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 活动兴趣类
 * @Date 16:17 23/3/2020
 * @version 3.4.25
**/
@Mapper
public interface ActivityMapper {
    /**
     * @author PQ
     * @Description 添加一个活动
     * @param activity:活动类
     * @return 返回受影响的行数
     * @Date 16:19 23/3/2020
     * @version 3.4.25
    **/
    @Insert("INSERT INTO `activity`(`name`, `context`) VALUES(#{name}, #{context})")
    @Options(useGeneratedKeys = true, keyProperty = "activityId", keyColumn = "activity_id")
    Integer postActivity(Activity activity);

    /**
     * @author PQ
     * @Description 查询所有活动
     * @return 返回所有活动
     * @Date 17:02 23/3/2020
     * @version 3.4.25
    **/
    @Select("SELECT * FROM `activity`")
    ArrayList<Activity> getAllActivity();

    /**
     * @author PQ
     * @Description 删除一个活动
     * @Date 17:08 23/3/2020
     * @version 3.4.25
    **/
    @Delete("DELETE FROM `activity` WHERE `activity_id` = #{activityId}")
    Integer deleteActivityById(int activityId);
}
