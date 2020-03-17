package com.paqi.friendsystem.entity.user;

import lombok.Data;

/**
 * @author PQ
 * @Description 用户基本信息类
 * @Date 上午2:07 16/3/2020
 * @version 1.2.0
**/
@Data
public class UserInfo {
    private int userId;
    private String userName;
    private String realName;
    private String job;
    private String introduction;
    private String hobby;
    private int age;
    private boolean sex;
}
