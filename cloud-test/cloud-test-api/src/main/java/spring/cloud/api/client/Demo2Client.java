package spring.cloud.api.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spring.cloud.api.hystrix.Demo2ClinetHystrix;

/**
 * Created by apple on 2017/12/6.
 */
@FeignClient(name = "test-provider", fallback = Demo2ClinetHystrix.class)
public interface Demo2Client {
      @RequestMapping(method = RequestMethod.GET, value = "/in2")
      String in2(@RequestParam(value = "id", required = false) Long id);
}
