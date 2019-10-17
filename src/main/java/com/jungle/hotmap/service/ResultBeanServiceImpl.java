package com.jungle.hotmap.service;

import com.jungle.hotmap.bean.ResultBean;
import com.jungle.hotmap.domain.Stat;
import com.jungle.hotmap.mapper.StatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ResultBeanServiceImpl implements ResultBeanService{

    /**
     * 注入 DAO
     */
    @Autowired
    private StatMapper statMapper;


    @Override
    public List<Stat> selectTest() {
        return null;
    }

    @Override
    public List<ResultBean> selectRight() {
        return statMapper.selectRight();
    }
}
