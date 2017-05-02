package com.zoufanqi.service.impl;

import com.zoufanqi.bean.Test;
import com.zoufanqi.mapper.TestMapper;
import com.zoufanqi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vanki on 2017/5/2.
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    public int add(Test test) {
        if (test == null) return 0;

        test.setId(null);
        return this.testMapper.insertSelective(test);
    }

    public Test getById(Integer id) {
        if (id == null) return null;
        return this.testMapper.selectByPrimaryKey(id);
    }
}
