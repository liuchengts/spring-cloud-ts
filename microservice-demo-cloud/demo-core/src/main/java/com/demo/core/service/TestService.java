package com.demo.core.service;

import com.demo.common.primary.Test;
import com.demo.common.secondary.Stest;

/**
 * 需要做些业务本项目业务逻辑后再进行db处理的接口声明
 * 当直接调用Repository层无法完成时，就使用这一层
 */
public interface TestService {

    /**
     * 统一新增操作
     * @param test
     * @param stest
     * @return
     */
   boolean add(Test test, Stest stest);

}
