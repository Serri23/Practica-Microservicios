package com.practica.pago;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PagoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagoApplication.class, args);
	}

	
}
