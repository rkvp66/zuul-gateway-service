package com.eureka.client.jpa.clienttoclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/*
 * zuul-gateway-service is what end users use. In this Properties file will have routes that configures the other two micro services  using application ids and directs the uri pattern .Using Eureka Service discovery it will dynamically route the calls 
 */


@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayServiceApplication.class, args);
	}

}
