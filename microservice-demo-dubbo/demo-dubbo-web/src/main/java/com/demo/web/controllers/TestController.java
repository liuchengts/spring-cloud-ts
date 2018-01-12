package com.demo.web.controllers;

import com.demo.common.TestManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by apple on 2018/1/12.
 * 测试类控制器
 */
@Slf4j
@RestController
public class TestController {
    private final TestManager testManager;

    @Autowired
    public TestController(TestManager testManager) {
        this.testManager = testManager;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public Object add(@RequestParam(value = "content") String content) {
        return testManager.add(content);
    }
}
