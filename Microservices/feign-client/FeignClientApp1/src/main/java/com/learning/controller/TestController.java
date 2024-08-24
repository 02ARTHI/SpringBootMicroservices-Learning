package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private Environment envi;
	
	 @GetMapping("/info")
	 public String get()
	 {
		 String envString = envi.getProperty("server.port");
		 return envString+" -> "+"message from producer";
	 }
}
