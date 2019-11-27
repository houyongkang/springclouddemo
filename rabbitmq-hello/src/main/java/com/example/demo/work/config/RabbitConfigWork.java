package com.example.demo.work.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * 	Work模式
 * @author Mr yi
 * @time 2019年6月19日
 */
@Configuration
public class RabbitConfigWork {

	 @Bean
	 public Queue queueWork() {
        return new Queue("queue_work");
    }
}
