package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.api.client.Demo2Client;
import spring.cloud.api.client.DemoClient;
import spring.cloud.evnet.PublishEvent;

/**
 * Created by apple on 2017/12/7.
 */
@Slf4j
@RestController
public class TestController {
    private final DemoClient demoClient;
    private final Demo2Client demo2Client;
    private final ApplicationContext context;
    @Autowired
    public TestController(DemoClient demoClient, Demo2Client demo2Client, ApplicationContext context) {
        this.demoClient = demoClient;
        this.demo2Client = demo2Client;
        this.context = context;
    }

    @RequestMapping(value = "/publish")
    public String publish(@RequestParam(value = "destination", required = false, defaultValue = "**") String destination) {
        // each service instance must have a unique context ID
        final String myUniqueId = context.getId();
        final PublishEvent event =new PublishEvent(this, myUniqueId, destination, "hello world");
        //因为我们在启动类上设置了@RemoteApplicationEventScan注解，所以通过context发送的时间将变成一个bus event总线事件，而不是在自身context中发布的一个ApplicationEvent
        context.publishEvent(event);
        return "event published";
    }

    @RequestMapping("/in")
    public String index() {
        log.error("测试错误");
        log.info("测试info输出");
        log.debug("测试debug输出");
        return demoClient.in();
    }
    @RequestMapping("/test")
    public String test() {
        log.error("测试错误");
        log.info("测试info输出");
        log.debug("测试debug输出");
        return demoClient.in();
    }
    @RequestMapping("/index")
    public String index(@RequestParam(value = "id") Long id) {
        return demo2Client.in2(id);
    }

}
