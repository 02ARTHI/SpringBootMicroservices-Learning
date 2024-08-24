package com.learning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class controllerclass {

	 


     @GetMapping("/info-get")	
	 public String get()
	 {
    	 RestTemplate restTemplate = new RestTemplate();
    	 ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:1111/info", String.class);
    	 String body = forEntity.getBody();
    	 return body +" this is rest template app 2";
	 }
}

