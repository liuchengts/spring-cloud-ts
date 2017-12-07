package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.api.client.Demo2Client;
import spring.cloud.api.client.DemoClient;

/**
 * Created by apple on 2017/12/7.
 */
@RestController
public class TestController {
    private final DemoClient demoClient;
    private final Demo2Client demo2Client;

    @Autowired
    public TestController(DemoClient demoClient, Demo2Client demo2Client) {
        this.demoClient = demoClient;
        this.demo2Client = demo2Client;
    }

    @RequestMapping
    public String index() {
        return demoClient.in();
    }

    @RequestMapping("/index")
    public String index(@RequestParam(value = "id") Long id) {
        return demo2Client.in2(id);
    }
}
