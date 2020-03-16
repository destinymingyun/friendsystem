package com.paqi.friendsystem.mappertest;

import com.paqi.friendsystem.entity.user.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author PQ
 * @Description 用户信息数据库操作
 * @Date 上午11:46 16/3/2020
 * @version 2.0.2
**/
@Mapper
public interface UserInfoMapper {
    /**
     * 向数据库user_info插入一条新记录,当userInfo.sex值为true时为女性，否则为男性
     * @author PQ
     * @Description 根据用户信息添加一条记录
     * @param userInfo：要插入的用户基本信息,userInfo.userId不可为空
     * @return 数据库中受影响的行数，插入失败返回0，插入成功返回1。
     * @Date 上午11:49 16/3/2020
     * @version 2.02
    **/
    @Insert("INSERT INTO `user_info` (`user_id`, `sex`, `username`, `introduction`, `hobby`, `job`, `age`, `real_name`)" +
            " VALUES (#{userId}, #{sex}, #{userName}, #{introduction}, #{hobby}, #{job}, #{age}, #{realName})")
    int postUserInfo(UserInfo userInfo);

    /**
     * 根据用户id查询用户基本信息
     * @author PQ
     * @Description 根据用户id查询信息
     * @param userId：用户id，唯一标识符
     * @return 返回该用户基本信息
     * @Date 下午12:46 16/3/2020
     * @version 2.03
    **/
    @Select("SELECT `*` FROM `user_info` WHERE `user_id` = ${userId}")
    UserInfo getUserInfoById(int userId);
}
