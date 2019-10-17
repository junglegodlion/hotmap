package com.jungle.hotmap.mapper;

import com.jungle.hotmap.bean.ResultBean;
import com.jungle.hotmap.domain.Stat;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

@Repository
public interface StatMapper extends MyMapper<Stat> {
    public List<Stat> selectTest();
    public int queryByunitclass();
    public List<ResultBean> selectRight();
}