package com.paqi.friendsystem.controller.restcontroller;

import com.paqi.friendsystem.entity.Literature;
import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /**
     * @author PQ
     * @Description 写文章
     * @Date 13:31 20/3/2020
     * @version 3.4.13
    **/
    @PostMapping("/write")
    public int write(Literature literature, HttpServletRequest httpServletRequest) {
        literature.setCreateTime(new Date());
        Account account = (Account)(httpServletRequest.getSession().getAttribute("account"));
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
}
