package com.abhi.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.abhi")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig() ::0-param constructor");
	}
	
	@Bean(name="sysDate")
	public LocalDateTime createdate() {
		return LocalDateTime.now();
	}

}
