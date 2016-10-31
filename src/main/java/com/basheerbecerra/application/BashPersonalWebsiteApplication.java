package com.basheerbecerra.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.basheerbecerra" })
public class BashPersonalWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(BashPersonalWebsiteApplication.class, args);
	}
}
