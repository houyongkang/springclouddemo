package com.example.demo.work.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 
 * @method 消费者A
 * @author Mr yi
 * @time 2019年6月19日
 */
@Component
@RabbitListener(queues = "queue_work")
public class ConsumersWorkA {
	
	@RabbitHandler
    public void process(String message) {
        System.out.println("消费者1 : " + message);
    }

}
