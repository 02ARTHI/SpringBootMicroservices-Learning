package com.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ConfigClientApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApp2Application.class, args);
	}

	
}
