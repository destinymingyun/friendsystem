package com.paqi.friendsystem.mapper;

import com.paqi.friendsystem.entity.relation.FunMember;
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
}
