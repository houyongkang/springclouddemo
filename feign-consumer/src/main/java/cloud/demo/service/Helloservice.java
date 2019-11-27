package cloud.demo.service;

import cloud.demo.entity.User;

import cloud.demo.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: fallback:服务触发hystrix降级后调用HelloServiceImpl中的方法
 * @Author: Yongkang Hou
 * @Date: 2019-07-30
 */
@FeignClient(value = "EUREKA-PROVIDE",fallback = HelloServiceImpl.class)//名称不区分大小写
public interface Helloservice {
    @RequestMapping("/hello")
    String hello();

    /**
     * //定义各参数绑定时RequestParam，RequestHeader等可以指定参数的注解value必须要写。
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") int age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);

    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello4();

}
