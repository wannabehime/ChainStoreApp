package com.example.chainstoreapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	@Bean("restTemplate")
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
