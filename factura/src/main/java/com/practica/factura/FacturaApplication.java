package com.practica.factura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class FacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturaApplication.class, args);

	}


}
