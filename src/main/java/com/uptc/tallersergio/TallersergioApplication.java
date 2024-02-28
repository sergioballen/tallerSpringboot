package com.uptc.tallersergio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class TallersergioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallersergioApplication.class, args);
	}

}
