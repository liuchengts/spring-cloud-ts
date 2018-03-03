package com.demo.core.event;


/**
 * 测试事件接口
 *
 * @author liucheng
 * @create 2018-03-03 09:47
 **/
public interface DemoEvent {
    /**
     * 一个通用的发送消息测试类
     *
     * @param top     top发送地址
     * @param content 发送内容
     */
    void sendTest(String top, String content);
}
