package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeignClientApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApp1Application.class, args);
	}

}
