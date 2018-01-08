package com.example.demo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.api.client.DemoClient;

/**
 * Created by apple on 2017/12/7.
 */
@Slf4j
@RestController
public class DemoController implements DemoClient {

    @Override
    public String in() {
        log.error("p测试错误");
        log.info("p测试info输出");
        log.debug("p测试debug输出");
        if(1==1){
            throw new  RuntimeException("p自定义异常");
        }
        return "调用in()成功";
    }
}
