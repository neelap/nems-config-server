package com.nems.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigServer
@ComponentScan
public class NemsConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(NemsConfigurationApplication.class, args);
	}
}
