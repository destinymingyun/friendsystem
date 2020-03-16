package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.entity.user.UserInfo;

/**
 * @author PQ
 * @Description
 * @Date 下午2:32 16/3/2020
 * @version 2.1.0
**/
public interface UserService {
    /**
     * @author PQ
     * @Description
     * @param account：用户账户
     * @return 返回用户id，若为0则账户或密码不对
     * @Date 下午2:45 16/3/2020
     * @version 2.1.0
    **/
    int login(Account account);

    /**
     * 账户注册
     * @author PQ
     * @Description 账号注册
     * @param account：用户账户信息
     * @param userInfo：用户基本信息
     * @return 返回用户id
     * @Date 下午3:50 16/3/2020
     * @version 2.1.1
    **/
    int registerAccount(Account account, UserInfo userInfo);

    /**
     * 在调用registerAccount()方法前应先调用此方法检查该账户是否有被注册过
     * @author PQ
     * @Description 检查是否已有该账户
     * @param account：要注册的账号
     * @return 该账户被注册返回true，否则返回false
     * @Date 下午4:18 16/3/2020
     * @version 2.1.1
    **/
    boolean checkAccountRepeat(String account);
}
