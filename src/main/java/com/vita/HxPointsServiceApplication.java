package com.vita;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableAsync
@EnableSwagger2
@SpringBootApplication
@EnableDiscoveryClient
public class HxPointsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HxPointsServiceApplication.class, args);
	}
}
