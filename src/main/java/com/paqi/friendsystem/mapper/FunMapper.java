package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.Fun;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

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
    @Insert("INSERT INTO `fun`(`fun_name`, `builder_id`, `member_num`, `literature_num`, `create_time`) " +
            "VALUES(#{funName}, #{builderId}, #{memberNum}, #{literatureNum}, #{createTime})")
    @Options(useGeneratedKeys = true, keyProperty = "funId", keyColumn = "fun_id")
    int postFun(Fun fun);
}