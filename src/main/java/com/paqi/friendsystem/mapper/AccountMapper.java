package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.user.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

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
     * @return 受影响的行数
     * @Date 上午2:22 16/3/2020
     * @version 2.0
    **/
    @Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "user_id")
    @Insert("INSERT INTO `account`(`account`, `password`, `user_type`) VALUES(#{account}, #{password}, #{userType})")
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
}
