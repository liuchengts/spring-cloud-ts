package com.demo.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.common.TestManager;
import com.demo.common.primary.Test;
import com.demo.common.secondary.Stest;
import com.demo.core.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by apple on 2018/1/12.
 * dubbo实现
 */
@Slf4j
@Service
@Component
public class TestManagerImpl implements TestManager {
    private final TestService testService;

    @Autowired
    public TestManagerImpl(TestService testService) {
        this.testService = testService;
    }

    @Override
    public String add(String content) {
        testService.add(Test.builder()
                        .content(content)
                        .build(),
                Stest.builder()
                        .content(content)
                        .build());
        return "操作成功";
    }
}
