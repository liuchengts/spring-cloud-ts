package spring.cloud.api.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import spring.cloud.api.client.Demo2Client;
import spring.cloud.api.client.DemoClient;

/**
 * Created by apple on 2017/12/7.
 */
@Component
public class Demo2ClinetHystrix implements Demo2Client {

    @Override
    public String in2(@RequestParam(value = "id") Long id) {
        System.out.println("熔断执行in2()" + id);
        return "熔断执行in2()" + id;
    }
}
