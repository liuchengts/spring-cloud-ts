package spring.cloud.api.hystrix;

import org.springframework.stereotype.Component;
import spring.cloud.api.client.DemoClient;

/**
 * Created by apple on 2017/12/7.
 */
@Component
public class DemoClinetHystrix implements DemoClient {
    @Override
    public String in() {
        System.out.println("熔断执行in()");
        return "熔断执行in()";
    }
}
