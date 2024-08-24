package com.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerclass {

     @GetMapping("/info")	
	 public String get()
	 {
		 return "this is rest template app 1";
	 }
}

