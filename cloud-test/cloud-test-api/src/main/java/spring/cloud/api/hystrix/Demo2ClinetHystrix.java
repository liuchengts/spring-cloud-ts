package spring.cloud.api.hystrix;

import org.springframework.stereotype.Component;
import spring.cloud.api.client.Demo2Client;
import spring.cloud.api.client.DemoClient;

/**
 * Created by apple on 2017/12/7.
 */
@Component
public class Demo2ClinetHystrix implements Demo2Client {

    @Override
    public String in2(Long id) {
        System.out.println("熔断执行in2()");
        return null;
    }
}
