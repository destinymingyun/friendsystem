package com.paqi.friendsystem.mappertest;

import com.paqi.friendsystem.entity.user.UserSafety;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author PQ
 * @Description 用户安全信息类，用于密码修改
 * @Date 下午1:13 16/3/2020
 * @version 2.0.4
**/
@Mapper
public interface UserSafetyMapper {
    /**
     * 向数据库中user_safety添加一条信息
     * @author PQ
     * @Description 添加用户安全信息
     * @param userSafety：用户安全问题
     * @return 返回数据库受影响的行数
     * @Date 下午1:14 16/3/2020
     * @version 2.0.4
    **/
    @Insert("INSERT INTO `user_safety` (`user_id`, `question1`, `question2`, `question3`, `answer1`, `answer2`, `answer3`)" +
            " VALUES (#{userId}, #{question1}, #{question2}, #{question3}, #{answer1}, #{answer2}, #{answer3})")
    int postUserMSafety(UserSafety userSafety);

    /**
     * 根据用户id从user_safety表中获取该用户的安全信息
     * @author PQ
     * @Description 根据用户id获取用户安全信息
     * @param userId：用户id，唯一标识符
     * @return 返回该用户的安全信息
     * @Date 下午2:24 16/3/2020
     * @version 2.0.5
    **/
    @Select("SELECT * FROM `user_safety` WHERE `user_id` = ${userId}")
    UserSafety getUserSafety(int userId);
}
