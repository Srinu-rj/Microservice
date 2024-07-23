package com.order.orderdeatels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderDeatelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderDeatelsApplication.class, args);
		System.out.println("ORDER SERVICE");
	}

}
