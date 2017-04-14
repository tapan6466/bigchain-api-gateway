package com.pwc.bigchain.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.pwc.bigchain.apigw.common.annotations.Microservice;

@Microservice
//@EnableZuulProxy
public class BigChainApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigChainApiGatewayApplication.class, args);
	}
}
