package com.miss.msclienthi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsClientHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsClientHiApplication.class, args);
	}
}
