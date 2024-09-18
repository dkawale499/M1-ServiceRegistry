package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class M1ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(M1ServiceRegistryApplication.class, args);
	}

}
