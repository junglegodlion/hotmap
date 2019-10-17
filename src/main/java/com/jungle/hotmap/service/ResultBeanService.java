package com.jungle.hotmap.service;

import com.jungle.hotmap.bean.ResultBean;
import com.jungle.hotmap.domain.Stat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public interface ResultBeanService {
    public List<Stat> selectTest();
    public List<ResultBean> selectRight();
}
