package com.miss.msclienthello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsClientHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClientHelloApplication.class, args);
	}
}
