package com.paqi.friendsystem.entity.user;

import lombok.Data;

/**
 * @author PQ
 * @Description 用户安全信息类
 * @Date 上午2:09 16/3/2020
 * @version 1.2.0
**/
@Data
public class UserSafety {
    private int userId;
    private String question1;
    private String answer1;
    private String question2;
    private String answer2;
    private String question3;
    private String answer3;
}
