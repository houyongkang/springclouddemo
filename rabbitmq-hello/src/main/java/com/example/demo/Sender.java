package com.example.demo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
//@RabbitListener(queues = "hello")
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    //@RabbitHandler
    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
// 调用 发送消息的方法
        this.rabbitTemplate.convertAndSend("hello", context);

    }




}
