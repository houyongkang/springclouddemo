package com.example.demo.work.test;

import com.example.demo.work.producers.ProducersWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping("/work")
public class RabbimMqWorkTest {

	@Autowired
	private ProducersWork producers;
	@ResponseBody
	@RequestMapping("/send")
    public void send() throws Exception {
		System.out.println("haha");
    	producers.send();
    }
}
