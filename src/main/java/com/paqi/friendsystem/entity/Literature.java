package com.paqi.friendsystem.entity;

import lombok.Data;

/**
 * @author PQ
 * @Description 文章实体类
 * @Date 上午3:08 17/3/2020
 * @version 3.1.0
**/
@Data
public class Literature {
    private int literatureId;
    private int authorId;
    private int title;
    private int context;
}
