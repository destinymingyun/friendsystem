package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.user.Account;
import org.apache.ibatis.annotations.*;

/**
 * @author PQ
 * @Description 用户账号表数据库操作
 * @Date 上午2:19 16/3/2020
 * @version 2.0
**/
@Mapper
public interface AccountMapper {
    /**
     *  向数据库`account`表插入一条新的记录
     * @author PQ
     * @Description 向account表插入一条新记录
     * @param account:账号实体类，仅填写account和password
     * @return userId
     * @Date 上午2:22 16/3/2020
     * @version 2.0
    **/
    @Insert("INSERT INTO `account`(`account`, `password`, `user_type`) VALUES(#{account}, #{password}, #{userType})")
    @Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "user_id")
    int postAccount(Account account);

    /**
     * 根据用户的账号和密码获取用户的userId，仅当两个条件同时满足才会返回userId
     * @author PQ
     * @Description 根据账户获取
     * @param account:保存的用户账户密码的实体类
     * @return 返回该用户的userId号
     * @Date 上午11:19 16/3/2020
     * @version 2.0.1
    **/
    @Select("SELECT `user_id` FROM `account` WHERE `account` = #{account} AND `password` = #{password}")
    int getUserIdByAccountAndPassword(Account account);

    /**
     * 根据用户账户返回用户id
     * @author PQ
     * @Description
     * @param account：用户账户
     * @return 用户id
     * @Date 下午4:23 16/3/2020
     * @version 2.1.2
    **/
    @Select("SELECT `user_id` FROM `account` WHERE `account` = #{account}")
    int getUserIdByAccount(String account);

    /**
     * 根据账户和旧密码更新密码
     * @author PQ
     * @Description 更改密码
     * @param account：用户账户
     * @param oldPassword：旧密码
     * @param newPassword：新密码
     * @return 返回受影响的行数
     * @Date 上午12:39 18/3/2020
     * @version 3.3.1
    **/
    @Update("UPDATE `account` SET `password` = #{newPassword} " +
            "WHERE `account` = #{account} AND `password` = #{oldPassword}")
    int putPasswordByAccountAndOldPassword(@Param("account") String account, @Param("oldPassword") String oldPassword,
                                           @Param("newPassword")String newPassword);
}
