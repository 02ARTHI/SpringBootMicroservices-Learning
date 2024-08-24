package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.feign.IFeignClient;

@RestController
public class TestController {
  
	@Autowired
	private IFeignClient feignClient;
	
	@Autowired
	private Environment envi;
	
	@GetMapping("/get")
	public String msg()
	{
		String gtmsg = feignClient.Gtmsg();
		String envString = envi.getProperty("server.port");
		return gtmsg +" -> "+ envString + " -> " + "message from consumer";
	}
}
