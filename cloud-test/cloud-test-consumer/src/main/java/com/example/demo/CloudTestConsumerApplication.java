package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringCloudApplication
@EnableFeignClients//启动Feign
@EnableHystrix//开启断路器功能
public class CloudTestConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTestConsumerApplication.class, args);
	}
}
