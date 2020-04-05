package com.si20103262.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Si20103262BankConfigServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(Si20103262BankConfigServerApplication.class, args);
	}

}
