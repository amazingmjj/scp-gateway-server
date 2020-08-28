package org.zhd.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author juny
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ScpGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScpGatewayServerApplication.class, args);
	}

}
