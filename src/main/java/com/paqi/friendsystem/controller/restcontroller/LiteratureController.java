package com.paqi.friendsystem.controller.restcontroller;

import com.paqi.friendsystem.entity.Discuss;
import com.paqi.friendsystem.entity.Literature;
import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.service.DiscussService;
import com.paqi.friendsystem.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author PQ
 * @Description 文章控制controllerf
 * @Date 13:04 20/3/2020
 * @version 3.4.12
**/
@RestController
@RequestMapping("/api/literature")
public class LiteratureController {
    @Autowired
    private LiteratureService literatureService;

    @Autowired
    private DiscussService discussService;

    /**
     * @author PQ
     * @Description 写文章
     * @Date 13:31 20/3/2020
     * @version 3.4.13
    **/
    @PostMapping("/write")
    public int write(Literature literature, HttpServletRequest httpServletRequest) {
        literature.setCreateTime(new Date());
//        Account account = (Account)(httpServletRequest.getSession().getAttribute("account"));
        Account account = new Account();
        account.setUserId(5);
        literature.setAuthorId(account.getUserId());
        literatureService.addLiterature(literature);
        return 1;
    }

    /**
     * @author PQ
     * @Description 根据部落获取文章列表
     * @Date 14:10 20/3/2020
     * @version 3.4.13
    **/
    @GetMapping("/literature-list")
    public ArrayList<Literature> getAllLiteratureByFunId(int funId) {
        return literatureService.getAllLiteratureInFun(funId);
    }

    /**
     * @author PQ
     * @Description 根据文章状态返回文章
     * @Date 23:55 20/3/2020
     * @version 3.4.19
    **/
    @GetMapping("/literature-status-list")
    public ArrayList<Literature> getAllLiteratureByStatus(int status) {
        return literatureService.getLiteratureByStatus(status);
    }

    /**
     * @author PQ
     * @Description 更新文章状态
     * @Date 00:40 21/3/2020
     * @version 3.4.19
    **/
    @PutMapping("/update-status")
    public boolean changeLiteratureStatus(int literatureId, int status) {
        return literatureService.updateLiterature(literatureId, status);
    }

    /**
     * @author PQ
     * @Description 为文章添加一条评论
     * @param discuss：评论
     * @return 添加成功返回true，否则返回false
     * @Date 16:47 22/3/2020
     * @version 3.4.24
    **/
    @PostMapping("/write-discuss")
    public boolean writeDiscuss(Discuss discuss, HttpServletRequest httpServletRequest) {
//        int userId = ((Account)(httpServletRequest.getSession().getAttribute("account"))).getUserId();
        int userId = 5;
        discuss.setCreateTime(new Date());
        discuss.setAuthorId(userId);
        int ret = discussService.addDiscuss(discuss);
        if (ret == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @author PQ
     * @Description 根据文章id获取文章内容
     * @Date 17:22 22/3/2020
     * @version 3.4.24
    **/
    @GetMapping("/get-discuss-list")
    public ArrayList<Discuss> getDiscussList(int literatureId) {
        return discussService.getDiscussList(literatureId);
    }
}
