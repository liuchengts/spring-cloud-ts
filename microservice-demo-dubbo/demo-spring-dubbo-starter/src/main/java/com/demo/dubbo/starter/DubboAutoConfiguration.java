package com.demo.dubbo.starter;

import com.demo.cloud.starter.hystrix.TestHystrix;
import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboAutoConfiguration {
    //这里可以对dubbo进行个性化配置
}
