package com.pwc.bigchain.apigw;

import org.springframework.boot.SpringApplication;

import com.pwc.bigchain.apigw.common.annotations.Microservice;

/**
 * @author lokeshk025
 *
 */
@Microservice

// @EnableZuulProxy
// @RibbonClient(name = "bigchain-api-gateway-service", configuration =
// RibbonServiceConfiguration.class)
public class BigChainApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigChainApiGatewayApplication.class, args);
	}

}
/*
 * class RibbonServiceConfiguration {
 * 
 * @Autowired IClientConfig ribbonClientConfig;
 * 
 * @Bean public IPing ribbonPing(IClientConfig config) { return new PingUrl(); }
 * 
 * @Bean public IRule ribbonRule(IClientConfig config) { return new
 * AvailabilityFilteringRule(); } }
 */
