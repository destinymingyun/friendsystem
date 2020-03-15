package com.paqi.friendsystem.mappertest;

import com.paqi.friendsystem.entity.user.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * @author PQ
 * @Description 用户账号表数据库操作
 * @Date 上午2:19 16/3/2020
 * @version 2.0
**/
@Mapper
public interface AccountMapper {
    /**
     * @author PQ
     * @Description 向account表插入一条新记录
     * @Date 上午2:22 16/3/2020
     * @version 2.0
    **/
    @Options(useGeneratedKeys = true, keyProperty = "userId", keyColumn = "user_id")
    @Insert("INSERT INTO `account`(`account`, `password`, `user_type`) VALUES(#{account}, #{password}, #{userType})")
    int postAccount(Account account);
}
