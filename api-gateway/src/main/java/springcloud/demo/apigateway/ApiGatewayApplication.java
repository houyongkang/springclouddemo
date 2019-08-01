package springcloud.demo.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import springcloud.demo.apigateway.config.AccessFilter;

@EnableZuulProxy
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	/**
	 * 开启请求过滤
	 * @return
	 */
	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter ();
	}

	/**
	 * 自定义服务与路由映射关系
	 *
	 * @return
	 */
	@Bean
	public PatternServiceRouteMapper patternServiceRouteMapper(){
		return new PatternServiceRouteMapper (
				"(?<name>^.)-(?<version>)v.+$",
				"${version}/${name}");

	}

}
