package com.pwc.bigchain.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import com.pwc.bigchain.apigw.common.annotations.Microservice;

@Microservice
@EnableCircuitBreaker
@EnableHystrixDashboard 
//@EnableZuulProxy
//@RibbonClient(name = "bigchain-api-gateway-service", configuration = RibbonServiceConfiguration.class)
public class BigChainApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigChainApiGatewayApplication.class, args);
	}
	
}
/*class RibbonServiceConfiguration {
    @Autowired
    IClientConfig ribbonClientConfig;
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}*/
