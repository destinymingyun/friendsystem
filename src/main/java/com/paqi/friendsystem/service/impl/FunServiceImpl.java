package com.paqi.friendsystem.service.impl;

import com.paqi.friendsystem.entity.Fun;
import com.paqi.friendsystem.entity.relation.FunMember;
import com.paqi.friendsystem.mapper.FunMapper;
import com.paqi.friendsystem.mapper.FunMemberMapper;
import com.paqi.friendsystem.service.FunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author PQ
 * @Description 兴趣部落服务接口实现类
 * @Date 下午10:15 17/3/2020
 * @version 3.3.0
**/
@Service
public class FunServiceImpl implements FunService {
    @Autowired
    private FunMapper funMapper;
    @Autowired
    private FunMemberMapper funMemberMapper;
    /**
     * @author PQ 创建一个部落,并返回部落id
     * @Description
     * @Date 下午10:15 17/3/2020
     * @version 3.3.0
    **/
    @Override
    public int createFun(Fun fun) {
        funMapper.postFun(fun);
        FunMember funMember = new FunMember();
        funMember.setMemberId(fun.getBuilderId());
        funMember.setFunId(fun.getFunId());
        funMemberMapper.postFunMember(funMember);
        return fun.getFunId();
    }

    /**
     * @author PQ
     * @Description 更改兴趣部落拥有者
     * @Date 上午12:25 18/3/2020
     * @version 3.3.1
    **/
    @Override
    public boolean changeOwner(int newOwnerId, int oldOwner, int funId) {
        int ret = funMapper.putOwnerIdByOldOwnerIdAndFunId(oldOwner, newOwnerId, funId);
        if (ret == 1) {
            return true;
        } else {
            return false;
        }
    }
}
