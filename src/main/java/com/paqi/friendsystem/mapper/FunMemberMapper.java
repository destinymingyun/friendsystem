package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.relation.FunMember;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author PQ
 * @Description 兴趣部落成员数据库操作
 * @Date 下午9:33 17/3/2020
 * @version
**/
@Mapper
public interface FunMemberMapper {
    /**
     * 将某个用户添加到某个兴趣部落
     * @author PQ
     * @Description 成员对应联系
     * @param funMember：兴趣部落成员表
     * @return 返回数据库影响的行数
     * @Date 下午9:34 17/3/2020
     * @version
    **/
    @Insert("INSERT INTO `fun_member`(`fun_id`, `member_id`) VALUES(#{funId}, #{memberId})")
    int postFunMember(FunMember funMember);
    
    /**
     * 删除一条用户与部落对应关系
     * @author PQ
     * @Description 删除一条对应关系
     * @param funMember：用户部落联系
     * @return 返回受影响的行数
     * @Date 10:21 18/3/2020
     * @version 3.3.2
    **/
    @Delete("DELETE FROM `fun_member` WHERE `fun_id` = ${funId} AND `member_id` = ${memberId}")
    int deleteFunMember(FunMember funMember);
}
