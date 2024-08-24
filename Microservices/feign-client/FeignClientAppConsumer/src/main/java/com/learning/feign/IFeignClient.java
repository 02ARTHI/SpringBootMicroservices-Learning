package com.learning.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@FeignClient("FEIGNCLIENTAPP1")
public interface IFeignClient {

	  @GetMapping("/info")
	  public String Gtmsg();
}
