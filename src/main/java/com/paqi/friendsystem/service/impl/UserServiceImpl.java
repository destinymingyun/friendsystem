package com.paqi.friendsystem.service.impl;

import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.entity.user.UserInfo;
import com.paqi.friendsystem.mapper.AccountMapper;
import com.paqi.friendsystem.mapper.UserInfoMapper;
import com.paqi.friendsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 用户接口实现类
 * @Date 下午3:38 16/3/2020
 * @version 2.1.0
**/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * @deprecated 3.4.11废弃
     * @author PQ
     * @Description 登录服务
     * @Date 下午3:39 16/3/2020
     * @version 2.0.0
    **/
    @Override
    public int login(Account account) {
        Integer userId = accountMapper.getUserIdByAccountAndPassword(account);
        if (userId == null) {
            return 0;
        } else {
            return userId;
        }
    }

    /**
     * @author PQ
     * @Description 注册服务
     * @Date 下午4:00 16/3/2020
     * @version 2.1.1
    **/
    @Override
    public int registerAccount(Account account, UserInfo userInfo) {
        accountMapper.postAccount(account);
        userInfo.setUserId(account.getUserId());
        userInfoMapper.postUserInfo(userInfo);
        return account.getUserId();
    }

    /**
     * @author PQ
     * @Description 检查用户账户是否重复
     * @Date 下午4:30 16/3/2020
     * @version 2.1.1
    **/
    @Override
    public boolean checkAccountRepeat(String account) {
        Integer userId = accountMapper.getUserIdByAccount(account);
        if (userId == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @author PQ
     * @Description 修改用户密码
     * @Date 上午12:54 18/3/2020
     * @version 3.3.1
    **/
    @Override
    public boolean changePassword(String account, String oldPassword, String newPassword) {
        int ret = accountMapper.putPasswordByAccountAndOldPassword(account, oldPassword, newPassword);
        if (ret == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PQ
     * @Description 账户登录类
     * @Date 21:41 19/3/2020
     * @version 3.4.11
    **/
    @Override
    public Account loginAccount(Account account) {
        Account dbAccount =  accountMapper.getAccountEntityByAccountAndPassword(account.getAccount(), account.getPassword());
        return dbAccount;
    }

    /**
     * @author PQ
     * @Description 根据用户类型获取用户列表
     * @Date 14:17 20/3/2020
     * @version 3.4.13
    **/
    @Override
    public ArrayList<Account> getUsers(int userType) {
        return accountMapper.getAllUser(userType);
    }

    /**
     * @author PQ
     * @Description 修改用户状态
     * @Date 16:13 20/3/2020
     * @version 3.4.14
    **/
    @Override
    public boolean setUserStatus(int userId, int status) {
        Integer ret = accountMapper.putAccountStatus(userId, status);
        if (ret == null) {
            return false;
        } else {
            return true;
        }
    }
}
