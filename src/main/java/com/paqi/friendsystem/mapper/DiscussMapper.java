package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.Discuss;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 评论实体类
 * @Date 下午6:15 17/3/2020
 * @version 3.2.0
**/
@Mapper
public interface DiscussMapper {
    /**
     * 为文章添加一条评论
     * @author PQ
     * @Description 添加一条评论
     * @param discuss：添加一条评论
     * @return 返回受影响的数据
     * @Date 下午6:16 17/3/2020
     * @version 3.2.0
    **/
    @Insert("INSERT INTO `discuss`(`author_id`, `literature_id`, `quote_discuss_id`, `context`, `create_time`) " +
            "VALUES(#{authorId}, #{literatureId}, #{quoteDiscussId}, #{context}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "discussId", keyColumn = "discuss_Id")
    int postDiscuss(Discuss discuss);

    /**
     * 删除关于某文章的评论
     * @author PQ
     * @Description 删除一条评论
     * @param literatureId:文章id
     * @return 返回受影响的行数
     * @Date 下午8:27 17/3/2020
     * @version 3.3.0
    **/
    @Delete("DELETE FROM `discuss` WHERE `literature_id` = ${literatureId}")
    int deleteDiscussByLiteratureId(int literatureId);

    /**
     * 根据文章id获取评论列表
     * @author PQ
     * @Description 根据文章id查询所有评论
     * @param literatureId：文章id、
     * @return 评论列表
     * @Date 17:15 22/3/2020
     * @version 3.4.24
    **/
    @Select("SELECT * FROM `discuss` WHERE `literature_id` = #{literatureId}")
    ArrayList<Discuss> getDiscussByLiteratureId(int literatureId);
}
