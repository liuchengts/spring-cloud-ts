package com.demo.web;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dubbo.annotation.EnableDubboConfiguration;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
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
@EnableDubboConfiguration
public class DemoDubboWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoDubboWebApplication.class, args);
    }

    @Bean
    @LoadBalanced
    ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return mapper;
    }

    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     *
     * @param binder 数据格式
     */
    @InitBinder
    void initBinder(ServletRequestDataBinder binder) {
        //1、日期
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor dateEditor = new CustomDateEditor(df, true);
        //表示如果命令对象有Date类型的属性，将使用该属性编辑器进行类型转换
        binder.registerCustomEditor(Date.class, dateEditor);
    }
}