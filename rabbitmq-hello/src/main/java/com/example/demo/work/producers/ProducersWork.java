package com.example.demo.work.producers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @method 生产者
 * @author Mr yi
 * @time 2019年6月19日
 */
@Component
public class ProducersWork {

	 @Autowired
	 private AmqpTemplate amqpTemplate;
	 
	 //生产者发送多个消息
	 public void send() throws Exception {
		 for(int i=0;i<=10;i++) {
	        String context = "Work["+i+"]"  ;
	        System.out.println("Producers sends message: " + context);
	        this.amqpTemplate.convertAndSend("queue_work", context);

	        Thread.sleep(100);
		 }
	   }
}
