package com.zoufanqi.service;

import com.zoufanqi.bean.Test;

/**
 * Created by vanki on 2017/5/2.
 */
public interface TestService {
    int add(Test test);

    Test getById(Integer id);
}
