package com.demo.server.rest;

import com.demo.cloud.starter.client.TestClient;
import com.demo.common.Test;
import com.demo.core.repository.TestRepository;
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

    private final TestRepository testRepository;

    @Autowired
    public TestClinetRest(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Override
    public Test add(@RequestParam(value = "content") String content) {
        return testRepository.save(Test.builder()
                .content(content)
                .build());
    }
}
