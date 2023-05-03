package com.shipment.logistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class LogisticsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LogisticsApplication.class, args);
	}

}
