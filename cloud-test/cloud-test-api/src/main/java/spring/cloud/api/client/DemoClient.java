package spring.cloud.api.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.cloud.api.hystrix.DemoClinetHystrix;

/**
 * Created by apple on 2017/12/6.
 */
@FeignClient(name = "test-provider", fallback = DemoClinetHystrix.class)
public interface DemoClient {
      @RequestMapping(method = RequestMethod.GET, value = "/in")
      String in();
}
