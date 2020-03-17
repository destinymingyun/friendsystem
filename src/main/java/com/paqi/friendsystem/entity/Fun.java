package com.paqi.friendsystem.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author PQ
 * @Description 兴趣实体类
 * @Date 上午3:15 17/3/2020
 * @version 3.1.0
**/
@Data
public class Fun {
    private int funId;
    private String funName;
    private int builderId;
    private int ownerId;
    private long memberNum;
    private long literatureNum;
    private Date createTime;
}
