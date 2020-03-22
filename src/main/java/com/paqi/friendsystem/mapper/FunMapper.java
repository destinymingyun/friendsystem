package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.Fun;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 兴趣圈
 * @Date 下午1:22 17/3/2020
 * @version 3.2.0
**/
@Mapper
public interface FunMapper {
    /**
     * 添加一个兴趣圈
     * @author PQ
     * @Description 创建一个兴趣圈
     * @param fun：兴趣
     * @return 返回受影响的行数
     * @Date 下午1:23 17/3/2020
     * @version 3.2.0
    **/
    @Insert("INSERT INTO `fun`(`fun_name`, `builder_id`, `member_num`, `literature_num`, `owner_id`, `introduction`, `create_time`) " +
            "VALUES(#{funName}, #{builderId}, #{memberNum}, #{literatureNum}, #{ownerId}, #{introduction}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "funId", keyColumn = "fun_id")
    int postFun(Fun fun);

    /**
     * 更新拥有者id
     * @author PQ
     * @Description 更新拥有者id
     * @param oldOwnerId：旧拥有者id
     * @param newOwnerId：新拥有者id
     * @param funId：兴趣部落id
     * @return 返回受影响的行数
     * @Date 下午10:51 17/3/2020
     * @version 3.3.0
    **/
    @Update("UPDATE `fun` SET `owner_id` = #{newOwnerId} " +
            "WHERE `owner_id` = #{oldOwnerId} AND `fun_id` = #{funId}")
    int putOwnerIdByOldOwnerIdAndFunId(@Param("oldOwnerId")int oldOwnerId, @Param("newOwnerId")int newOwnerId,
                                       @Param("funId")int funId);

    /**
     * @author PQ
     * @Description 获取全部fun
     * @return 返回星期部落列表
     * @Date 17:30 20/3/2020
     * @version 3.4.14
    **/
    @Select("SELECT * FROM `fun`")
    ArrayList<Fun> getAll();
}