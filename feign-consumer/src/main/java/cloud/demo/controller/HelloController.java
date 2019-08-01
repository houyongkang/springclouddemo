package cloud.demo.controller;

import cloud.demo.entity.User;
import cloud.demo.service.Helloservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Yongkang Hou
 * @Date: 2019-07-30
 */

@RestController
public class HelloController {
    @Resource
    private Helloservice helloservice;

    @RequestMapping("/feign-consumer")
    String helloConsumer() {
        Long starttime = System.currentTimeMillis ();
        String result = helloservice.hello ();
        Long endtime = System.currentTimeMillis ();
        System.out.println ("请求时间：" + (endtime - starttime));
        return result;
    }

    @RequestMapping("/feign-consumer4")
    String helloConsumer4() {
        return helloservice.hello4 ();
    }

    @RequestMapping("/feign-consumer1")
    String helloConsumer1() {
        Long starttime = System.currentTimeMillis ();
        StringBuffer stringBuffer = new StringBuffer ();
        stringBuffer.append (helloservice.hello ("张三") + "\t");
        stringBuffer.append (helloservice.hello ("张三", 18) + "\t");
        stringBuffer.append (helloservice.hello (new User ("李四", 20)) + "\n");
        Long endtime = System.currentTimeMillis ();
        System.out.println ("请求时间：" + (endtime - starttime));
        return stringBuffer.toString ();
    }


}
