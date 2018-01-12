package com.demo.cloud.starter.hystrix;

import com.demo.cloud.starter.client.TestClient;
import com.demo.common.Test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 提供feign方式的ChatLogClient接口熔断
 */
@Slf4j
@Component
public class TestHystrix implements TestClient {


    @Override
    public Test add(String content) {
        log.error("熔断执行");
        return null;
    }
}
