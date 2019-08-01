package springcloud.eureka.provide.eurekaprovide.hellocontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;
import springcloud.eureka.provide.eurekaprovide.entity.User;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;

/**
 * @Description:
 * @Author: Yongkang Hou
 * @Date: 2019-07-25
 */
@RestController
public class Hellcontroller {
    @Resource
    private Registration getServiceId;// 服务注册
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        Long starttime = System.currentTimeMillis ();

        List <ServiceInstance> instances = client.getInstances (getServiceId.getServiceId ());
        int sleepTime = new Random ().nextInt (3000);
        System.out.println ("睡眠时间" + sleepTime);
        try {
            Thread.sleep (sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        if (instances != null && instances.size () > 0) {
            System.out.println ("/hello,host:" + instances.get (0).getHost () + ", service_id:" + instances.get (0).getServiceId ());
        }

        Long endtime = System.currentTimeMillis ();
        System.out.println ("请求时间：" + (endtime - starttime));
        return "hello,provider";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello1(@RequestParam String name) {
        return "hello:" + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello2(@RequestHeader String name, @RequestHeader int age) {
        User user = new User ();
        user.setAge (age);
        user.setName (name);
        return user;
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello3(@RequestBody User user) {
        return user.getName () + ":" + user.getAge ();
    }


    //服务降级验证
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    public String hello4() {
        Long starttime = System.currentTimeMillis ();
        List <ServiceInstance> instances = client.getInstances (getServiceId.getServiceId ());
        try {
            Thread.sleep (5000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        if (instances != null && instances.size () > 0) {
            System.out.println ("/hello,host:" + instances.get (0).getHost () + ", service_id:" + instances.get (0).getServiceId ());
        }
        Long endtime = System.currentTimeMillis ();
        System.out.println ("请求时间：" + (endtime - starttime));
        return "hello,provider";
    }

}
