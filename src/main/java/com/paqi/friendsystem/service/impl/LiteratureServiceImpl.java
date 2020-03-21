package com.paqi.friendsystem.service.impl;

import com.paqi.friendsystem.entity.Literature;
import com.paqi.friendsystem.mapper.LiteratureMapper;
import com.paqi.friendsystem.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author PQ
 * @Description 文章服务类
 * @Date 下午7:07 17/3/2020
 * @version 3.3.0
**/
@Service
public class LiteratureServiceImpl implements LiteratureService {
    @Autowired
    private LiteratureMapper literatureMapper;
    /**
     * @author PQ
     * @Description 添加文章
     * @Date 下午7:58 17/3/2020
     * @version 3.3.0
    **/
    @Override
    public int addLiterature(Literature literature) {
        literatureMapper.postLiterature(literature);
        return literature.getLiteratureId();
    }

    /**
     * @author PQ
     * @Description 根据文章id删除一篇文章
     * @Date 下午9:27 17/3/2020
     * @version 3.3.0
    **/
    @Override
    public boolean deleteLiterature(int literatureId) {
        int ret = literatureMapper.deleteLiterature(literatureId);
        if (ret != 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @author PQ
     * @Description 根据部落获取对应全部文章
     * @Date 13:49 20/3/2020
     * @version 3.4.13
    **/
    @Override
    public ArrayList<Literature> getAllLiteratureInFun(int funId) {
        return literatureMapper.getLiteratureByFunId(funId);
    }

    /**
     * @author PQ
     * @Description 根据状态获取文章
     * @Date 23:44 20/3/2020
     * @version 3.4.19
    **/
    @Override
    public ArrayList<Literature> getLiteratureByStatus(int status) {
        return literatureMapper.getLiteratureByStatus(status);
    }

    /**
     * @author PQ
     * @Description 更新文章状态
     * @Date 00:50 21/3/2020
     * @version 3.4.19
    **/
    @Override
    public boolean updateLiterature(int literatureId, int status) {
        Integer ret = literatureMapper.putStatusByLiteratureId(literatureId, status);
        if (ret == null || ret == 0) {
            return false;
        } else {
            return true;
        }
    }
}
