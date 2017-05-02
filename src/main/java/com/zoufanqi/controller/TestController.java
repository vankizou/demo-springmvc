package com.zoufanqi.controller;

import com.zoufanqi.bean.Test;
import com.zoufanqi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by vanki on 2017/4/28.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    /**
     * http://localhost:8080/test/test.html 输入测试
     * @param path
     * @return
     */
    @RequestMapping("/{path}.html")
    public String path(@PathVariable String path) {
        return path;
    }

    @ResponseBody
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    public String add(Test test) {
        int status = this.testService.add(test);
        return status > 0 ? "成功" : "失败";
    }

    @ResponseBody
    @RequestMapping("getById.json")
    public Test getById(Integer id) {
        return this.testService.getById(id);
    }
}
