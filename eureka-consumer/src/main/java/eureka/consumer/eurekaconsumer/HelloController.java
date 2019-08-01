package eureka.consumer.eurekaconsumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: Yongkang Hou
 * @Date: 2019-07-25
 */
@RestController
public class HelloController {

    @Resource
    RestTemplate restTemplate;
    @RequestMapping("/hello")
    public String hello(){
        return  restTemplate.getForEntity ("http://eureka-provide/hello",String.class).getBody ();
    }
}
