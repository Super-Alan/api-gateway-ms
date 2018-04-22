package com.cifnews.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lucky
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterApplication.class, args);
	}
}
