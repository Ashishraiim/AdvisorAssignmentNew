package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class AdvisorDemoNewApplication implements WebSecurityConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(AdvisorDemoNewApplication.class, args);
	}

	@Override
	public void init(SecurityBuilder builder) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configure(SecurityBuilder builder) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
