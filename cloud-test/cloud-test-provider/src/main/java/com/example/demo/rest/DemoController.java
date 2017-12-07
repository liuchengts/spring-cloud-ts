package com.example.demo.rest;

import org.springframework.web.bind.annotation.RestController;
import spring.cloud.api.client.DemoClient;

/**
 * Created by apple on 2017/12/7.
 */
@RestController
public class DemoController implements DemoClient {

    @Override
    public String in() {
        return "调用in()成功";
    }
}
