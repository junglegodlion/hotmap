package com.jungle.hotmap.controller;

import com.jungle.hotmap.bean.ResultBean;
import com.jungle.hotmap.service.ResultBeanService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class StatController {

    @Autowired
    private ResultBeanService resultBeanService;
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model) {

        List<ResultBean> results = resultBeanService.selectRight();
        JSONArray jsonArray = JSONArray.fromObject(results);

        System.out.println("是否有数据");
        System.out.println(jsonArray);

        model.addAttribute("data", jsonArray);

        return "hotmap";
    }

}
