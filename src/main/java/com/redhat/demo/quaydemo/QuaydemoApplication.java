package com.redhat.demo.quaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
public class QuaydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuaydemoApplication.class, args);
	}

}
