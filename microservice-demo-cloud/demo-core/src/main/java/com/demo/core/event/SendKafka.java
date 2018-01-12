package com.demo.core.event;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/****
 * kafka消息发送处理
 */
@Component
@EnableAsync
public class SendKafka {
    private final KafkaTemplate kafkaTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public SendKafka(KafkaTemplate kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    /**
     * 发送消息测试类
     * @param top top发送地址
     * @param content 发送内容
     */
    @Async
    public  void  sendTest(String top, String content) {
        //如果需要json  使用objectMapper
        kafkaTemplate.send(top, content);
    }
}
