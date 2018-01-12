package com.demo.cloud.starter.client;


import com.demo.cloud.starter.hystrix.TestHystrix;
import com.demo.common.primary.Test;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 提供日志操作接口
 */
@FeignClient(name = "demo-server", fallback = TestHystrix.class)
public interface TestClient {

    /**
     * 增加记录
     *
     * @param content   内容
     * @return 返回日志对象
     */
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    String add(@RequestParam(value = "content") String content);


}