package com.telusko;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Test {

	
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/test")
	public String get()
	{
		return msg;
	}
}
