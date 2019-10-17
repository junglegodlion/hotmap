package com.jungle.hotmap;

import com.jungle.hotmap.bean.ResultBean;
import com.jungle.hotmap.domain.Stat;
import com.jungle.hotmap.mapper.StatMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Rollback
public class HotmapApplicationTests {

    /**
     * 注入 DAO
     */
    @Autowired
    private StatMapper statMapper;

    @Test
    public void testSelectAll() {
        List<Stat> tbUsers = statMapper.selectAll();
        tbUsers.forEach(tbUser -> {
            System.out.println(tbUser);
        });
    }



    @Test
    public void contextLoads() {
    }

    /**
     * 新增
     */
    @Test
    public void testInsert() {
        Stat stat = new Stat();
        stat.setTime(0L);
        stat.setLatitude(0.0D);
        stat.setLongitude(0.0D);


    }

    @Test
    public void testCount() {
        int i = statMapper.queryByunitclass();
        System.out.println(i);
    }
    @Test
    public void testRight() {
        List<ResultBean> resultBeans = statMapper.selectRight();
        resultBeans.forEach(resultBean -> {
            System.out.println(resultBean);
        });
    }
}
