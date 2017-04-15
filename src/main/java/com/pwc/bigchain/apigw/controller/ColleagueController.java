/**
 * 
 */
package com.pwc.bigchain.apigw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bigchain.api.model.Colleague;
import com.pwc.bigchain.apigw.service.CollegueManager;

/**
 * @author lokeshk025
 *
 */
@RestController
public class ColleagueController {
	@Autowired
	CollegueManager colleagueManager;

	/**
	 * @param name
	 * @return
	 */
	@GetMapping("/get/{name}")
	public ResponseEntity<List<Colleague>> getColleagues(@PathVariable("name") String name) {
		List<Colleague> list = colleagueManager.getColleaguesByName(name);
		return new ResponseEntity<>(list, HttpStatus.OK);

	}

}
