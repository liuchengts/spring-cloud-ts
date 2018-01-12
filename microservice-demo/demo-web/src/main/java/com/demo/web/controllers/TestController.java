package com.demo.web.controllers;

import com.demo.cloud.starter.client.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by apple on 2018/1/12.
 * 测试类控制器
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private final TestClient testClient;

    @Autowired
    public TestController(TestClient testClient) {
        this.testClient = testClient;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public Object add(@RequestParam(value = "content") String content) {
        return testClient.add(content);
    }
}
