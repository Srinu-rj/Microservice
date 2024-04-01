package com.conf.configserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServApplication.class, args);
	}

}
