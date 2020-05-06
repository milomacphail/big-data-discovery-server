package com.jethrodiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class JethroDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JethroDiscoveryServerApplication.class, args);
	}

}
