package com.paqi.friendsystem.controller.restcontroller;

import com.paqi.friendsystem.entity.Activity;
import com.paqi.friendsystem.entity.user.Account;
import com.paqi.friendsystem.service.ActivityService;
import com.paqi.friendsystem.service.UserService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;

/**
 * @author PQ
 * @version 3.4.13
 * @Description 管理员操作控制器
 * @Date 15:17 20/3/2020
 **/
@RestController
@RequestMapping("/api/admin")
public class SystemAdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private ActivityService activityService;

    /**
     * @author PQ
     * @Description 返回全部用户(非管理员)
     * @Date 14:28 20/3/2020
     * @version 3.4.13
     **/
    @GetMapping("/users")
    public ArrayList<Account> getUsers() {
        ArrayList<Account> accountList = userService.getUsers(1);
        for (Account account : accountList) {
            account.setPassword("");
        }
        return accountList;
    }

    /**
     * @author PQ
     * @Description 设置用户账户状态
     * @Date 15:57 20/3/2020
     * @version 3.4.13
     **/
    @PutMapping("/status")
    public boolean setUserStatus(int userId, int status) {
        System.out.println("userId = " + userId);
        return userService.setUserStatus(userId, status);
    }

    /**
     * @author PQ
     * @Description 添加一个活动
     * @Date 16:40 23/3/2020
     * @version 3.4.25
     **/
    @PostMapping("/add-activity")
    public boolean addActivity(Activity activity) {
        return activityService.addActivity(activity);
    }

    /**
     * @author PQ
     * @Description 删除活动
     * @Date 17:20 23/3/2020
     * @version 3.4.25
    **/
    @DeleteMapping("/delete-discuss")
    public boolean deleteActivity(int activityId) {
        return activityService.deleteActivity(activityId);
    }

    /**
     * @author PQ
     * @Description 获取活动列表
     * @Date 19:48 23/3/2020
     * @version 3.4.26
    **/
    @GetMapping("/getActivity")
    public ArrayList<Activity> getActivity() {
        return activityService.selectAllActivity();
    }
}
