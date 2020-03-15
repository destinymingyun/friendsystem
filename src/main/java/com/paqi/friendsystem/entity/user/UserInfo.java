package com.paqi.friendsystem.entity.user;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * @author PQ
 * @Description 用户基本信息类
 * @Date 上午2:07 16/3/2020
 * @version 1.2.0
**/
@Data
@ToString
@Builder
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
