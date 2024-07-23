package com.cart.foodcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FoodCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodCartApplication.class, args);
		System.out.println("FOOD SERVICE");
	}

}
