package com.paqi.friendsystem.service.impl;

import com.paqi.friendsystem.entity.Fun;
import com.paqi.friendsystem.entity.relation.FunMember;
import com.paqi.friendsystem.mapper.FunMapper;
import com.paqi.friendsystem.mapper.FunMemberMapper;
import com.paqi.friendsystem.service.FunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
        funMember.setFunId(fun.getFunId());
        funMember.setMemberId(fun.getBuilderId());
        this.joinFun(funMember);
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

    /**
     * @author PQ
     * @Description 加入一个兴趣部落
     * @Date 10:35 18/3/2020
     * @version 3.3.2
    **/
    @Override
    public int joinFun(FunMember funMember) {
        funMember.setMemberId(funMember.getMemberId());
        funMember.setFunId(funMember.getFunId());
        funMemberMapper.postFunMember(funMember);
        return funMember.getFunId();
    }

    /**
     * @author PQ
     * @Description 退出一个兴趣部落
     * @Date 10:38 18/3/2020
     * @version 3.3.2
    **/
    @Override
    public boolean exitFun(FunMember funMember) {
        int ret = funMemberMapper.deleteFunMember(funMember);
        if (ret == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PQ
     * @Description 返回所有兴趣部落
     * @Date 17:39 20/3/2020
     * @version 3.4.14
    **/
    @Override
    public ArrayList<Fun> getAllFun() {
        return funMapper.getAll();
    }

    @Override
    public boolean changeFunIntroduction(String introduction, int funId) {
        return false;
    }
}
