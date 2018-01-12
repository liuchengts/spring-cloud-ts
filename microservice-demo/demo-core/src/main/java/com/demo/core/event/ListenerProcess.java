package com.demo.core.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;


/****
 * kafka消息接收处理
 */
@Component
@EnableAsync
@Slf4j
public class ListenerProcess {

    @KafkaListener(topics = Tops.SOCKET_ADD)
    public void chatLog_add(String msg) {
    }
}
