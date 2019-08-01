package cloud.demo.service.impl;

import cloud.demo.entity.User;
import cloud.demo.service.Helloservice;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Yongkang Hou
 * @Date: 2019-07-30
 */

@Component
public class HelloServiceImpl implements Helloservice {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, int age) {
        return new User ("无名氏",0);
    }

    @Override
    public String hello(User user) {
          return "error";
    }

    @Override
    public String hello4() {
        return "error";
    }

}
