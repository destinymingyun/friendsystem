package com.paqi.friendsystem.entity;

import lombok.Data;
import java.util.Date;

/**
 * @author PQ
 * @Description 文章评论实体类
 * @Date 上午3:12 17/3/2020
 * @version 3.1.0
**/
@Data
public class Discuss {
    private int discussId;
    private int authorId;
    private int literatureId;
    private int quoteDiscussId;
    private String context;
    private Date createTime;
}
