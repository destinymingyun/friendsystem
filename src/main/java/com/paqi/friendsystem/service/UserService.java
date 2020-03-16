package com.paqi.friendsystem.service;

import com.paqi.friendsystem.entity.user.Account;

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
}
