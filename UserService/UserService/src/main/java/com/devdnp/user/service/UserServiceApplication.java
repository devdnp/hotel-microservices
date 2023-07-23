package com.devdnp.user.service;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.boot.builder.SpringApplicationBuilder;


@SpringBootApplication
@EnableDiscoveryClient
public class UserServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserServiceApplication.class, args);

//		new SpringApplicationBuilder(UserServiceApplication.class).web(WebApplicationType.SERVLET).run(args);

	}

}
