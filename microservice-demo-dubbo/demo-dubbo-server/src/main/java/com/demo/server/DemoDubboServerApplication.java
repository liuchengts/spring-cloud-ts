package com.demo.server;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dubbo.annotation.EnableDubboConfiguration;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
@Configuration
@EnableAsync //启用异步
@EntityScan({"com.demo.common.*"})
//@EnableJpaRepositories({"com.demo.core.repository.*"}) #单数据源可以使用此配置指定repository位置
@ComponentScan({"com.demo"})
@EnableDubboConfiguration
public class DemoDubboServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoDubboServerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return mapper;
    }
}