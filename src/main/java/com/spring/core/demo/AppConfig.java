package com.spring.core.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
	
}
