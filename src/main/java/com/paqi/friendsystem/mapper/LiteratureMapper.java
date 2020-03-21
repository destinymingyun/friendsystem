package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.Literature;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 文章实体dao层
 * @Date 上午3:19 17/3/2020
 * @version 3.2.0
**/
@Mapper
public interface LiteratureMapper {
    /**
     * 向literature添加一篇新文章
     * @author PQ
     * @Description 添加一篇新文章
     * @param literature：文章
     * @return 返回受影响的行数
     * @Date 上午3:23 17/3/2020
     * @version 3.2.0
    **/
    @Insert("INSERT INTO `literature`(`author_id`, `title`, `fun_id`, `context`, `create_time`) " +
            "VALUES(#{authorId}, #{title}, #{funId}, #{context}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "literatureId", keyColumn = "literature_id")
    int postLiterature(Literature literature);

    /**
     * 删除一篇文章
     * @author PQ
     * @Description 删除一篇文章
     * @param literatureId：文章id
     * @return 返回影响的行数
     * @Date 下午8:17 17/3/2020
     * @version 3.3.0
    **/
    @Delete("DELETE FROM `literature` WHERE `literature_id` = #{literatureId}")
    int deleteLiterature(int literatureId);

    /**
     * 根据兴趣查询全部文章
     * @author PQ
     * @Description 根据兴趣查询全部文章
     * @param funId：兴趣部落名
     * @return 返回文章列表
     * @Date 13:36 20/3/2020
     * @version 3.4.13
    **/
    @Select("SELECT * FROM `literature` WHERE `fun_id` = #{fun_id}")
    ArrayList<Literature> getLiteratureByFunId(int funId);

    /**
     * 根据文章id查询文章
     * @author PQ
     * @Description 根据文章id查询文章
     * @param literatureId：文章id
     * @return 返回文章内容
     * @Date 21:58 20/3/2020
     * @version 3.4.17
    **/
    @Select("SELECT * FROM `literature` WHERE `literature_id` = #{literatureId}")
    Literature getLiteratureByliteratureId(int literatureId);

    /**
     * 根据文章状态返回文章内容
     * @author PQ
     * @Description 根据文章状态返回文章
     * @param status：文章状态
     * @return 返回文章列表
     * @Date 23:35 20/3/2020
     * @version 3.4.19
    **/
    @Select("SELECT * FROM `literature` WHERE `status` = #{status}")
    ArrayList<Literature> getLiteratureByStatus(int status);

    /**
     * 更新文章状态
     * @author PQ
     * @Description 更新文章状态
     * @Date 00:42 21/3/2020
     * @version 3.4.19
    **/
    @Update("UPDATE `literature` SET `status` = #{status} WHERE `literature_id` = #{literatureId}")
    Integer putStatusByLiteratureId(int literatureId, int status);

    /**
     * 根据文章id获取文章
     * @author PQ
     * @Description 根据文章id获取文章
     * @param literatureId：文章id
     * @return 返回文章
     * @Date 01:18 21/3/2020
     * @version 3.4.20
    **/
    @Select("SELECT * FROM `literature` WHERE `literature_id` = #{literatureId}")
    Literature getLiteratureById(int literatureId);
}
