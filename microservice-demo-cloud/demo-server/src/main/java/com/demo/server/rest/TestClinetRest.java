package com.demo.server.rest;

import com.demo.cloud.starter.client.TestClient;
import com.demo.common.primary.Test;
import com.demo.common.secondary.Stest;
import com.demo.core.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现feign接口
 */
@Slf4j
@RestController
public class TestClinetRest implements TestClient {
    private final TestService testService;

    @Autowired
    public TestClinetRest(TestService testService) {
        this.testService = testService;
    }

    @Override
    public String add(@RequestParam(value = "content") String content) {
        testService.add(Test.builder()
                        .content(content)
                        .build(),
                Stest.builder()
                        .content(content)
                        .build());
        return "操作成功";
    }
}
