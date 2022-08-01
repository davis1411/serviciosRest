package com.example.serviciosrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class ServiciosrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiciosrestApplication.class, args);
	}

}
