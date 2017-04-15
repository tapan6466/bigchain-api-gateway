/**
 * 
 */
package com.pwc.bigchain.apigw.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bigchain.api.model.Colleague;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


/**
 * @author lokeshk025
 *
 */
@Service
public class CollegueManager {
	private static  Logger logger = Logger.getLogger(CollegueManager.class);
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	Environment environment;
	public String getURI()
	{
		return environment.getProperty("bigchain.api.ms.uri");
	}
	@HystrixCommand(fallbackMethod = "defaultColleaguesByName")
	public List<Colleague> getColleaguesByName(String name)
	{
		String url =getURI()+"/colleagues/"+name;
		logger.debug("Url is : - "+url);
		System.out.println("URL is  : - "+url);
		@SuppressWarnings("unchecked")
		List<Colleague> list = restTemplate.getForObject(url, ArrayList.class);
		System.out.println("List size is : - "+list.size());
		return list;
		
		
	}
	 private List<Colleague> defaultColleaguesByName(String name) {
		List x = new ArrayList();
		 x.add("Service is down right now!");
	        return x;
	    }
}
