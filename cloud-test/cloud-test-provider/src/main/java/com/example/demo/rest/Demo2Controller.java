package com.example.demo.rest;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.api.client.Demo2Client;
import spring.cloud.api.client.DemoClient;

/**
 * Created by apple on 2017/12/7.
 */
@RestController
public class Demo2Controller implements Demo2Client {

    @Override
    public String in2(@RequestParam(value = "id", required = false) Long id) {
        return "调用in2()成功";
    }
}
