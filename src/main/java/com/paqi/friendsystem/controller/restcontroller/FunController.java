package com.paqi.friendsystem.controller.restcontroller;

import com.paqi.friendsystem.entity.Fun;
import com.paqi.friendsystem.entity.relation.FunMember;
import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.service.FunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author PQ
 * @Description 兴趣部落controller
 * @Date 14:37 20/3/2020
 * @version 3.4.13
**/
@RequestMapping("/api/fun")
@RestController
public class FunController {
    @Autowired
    private FunService funService;

    /**
     * @author PQ
     * @Description 创建一个部落
     * @Date 15:16 20/3/2020
     * @version 3.4.13
    **/
    @PostMapping("/create-fun")
    public boolean createFun(Fun fun, HttpServletRequest httpServletRequest) {
//        int userId = ((Account)(httpServletRequest.getSession().getAttribute("account"))).getUserId();
        int userId = 6;
        fun.setCreateTime(new Date());
        fun.setBuilderId(userId);
        fun.setOwnerId(userId);
        int funid = funService.createFun(fun);
        if (funid == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @author PQ
     * @Description 获取全部部落
     * @Date 19:59 20/3/2020
     * @version 3.4.15
    **/
    @GetMapping("/get-fun-list")
    public ArrayList<Fun> getFun() {
        return funService.getAllFun();
    }

    /**
     * @author PQ
     * @Description 更改部落拥有者
     * @Date 14:21 22/3/2020
     * @version 3.4.24
    **/
    @PutMapping("/update-owner")
    public boolean changeOwner(int newOwnerId, int funId, HttpServletRequest httpServletRequest) {
//        int oldOwnerId = ((Account)(httpServletRequest.getSession().getAttribute("account"))).getUserId();
        int oldOwnerId = 6;
        return funService.changeOwner(newOwnerId, oldOwnerId, funId);
    }

    /**
     * @author PQ
     * @Description 加入部落
     * @Date 14:24 22/3/2020
     * @version 3.4.24
    **/
    @PostMapping("/join-fun")
    public boolean joinFun(int funId, HttpServletRequest httpServletRequest) {
        int userId = ((Account)(httpServletRequest.getSession().getAttribute("account"))).getUserId();
        FunMember funMember = new FunMember();
        funMember.setMemberId(userId);
        funMember.setFunId(funId);
        int ret = funService.joinFun(funMember);
        if (ret == 0) {
            return false;
        } else {
            return true;
        }
    }


}
