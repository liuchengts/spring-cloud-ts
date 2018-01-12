package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@EnableFeignClients//启动Feign
@EnableHystrix//开启断路器功能
@ComponentScan({"com.example.demo","spring.cloud.api"})
@RemoteApplicationEventScan(basePackages = "spring.cloud.event")
public class CloudTestConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTestConsumerApplication.class, args);
	}
}
