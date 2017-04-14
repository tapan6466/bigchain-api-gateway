/**
 * 
 */
package com.pwc.bigchain.apigw.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Response;

import org.apache.http.HttpResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pwc.bigchain.app.entity.Colleague;

/**
 * @author lokeshk025
 *
 */
@Service
public class CollegueManager {
	private static  Logger logger = Logger.getLogger(CollegueManager.class);
	@Autowired
	private RestTemplate restTemplate;
	public List<Colleague> getColleaguesByName(String name)
	{
		String url = "http://localhost:9999/colleagues/"+name;
		logger.debug("Url is : - "+url);
		System.out.println("URL is  : - "+url);
		@SuppressWarnings("unchecked")
		List<Colleague> list = restTemplate.getForObject(url, ArrayList.class);
		System.out.println("List size is : - "+list.size());
		return list;
		
		
	}

}
