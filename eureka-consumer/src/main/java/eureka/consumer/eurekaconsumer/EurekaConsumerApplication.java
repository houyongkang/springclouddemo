package eureka.consumer.eurekaconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumerApplication {
    //使restTemplate具有负载均衡的效果
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate ();
    }

    public static void main(String[] args) {
        SpringApplication.run (EurekaConsumerApplication.class, args);
    }

}
