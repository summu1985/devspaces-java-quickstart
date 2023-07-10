package com.redhat.demo.springbootjavaquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@Configuration
public class SpringBootJavaQuickstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJavaQuickstartApplication.class, args);
	}

}
