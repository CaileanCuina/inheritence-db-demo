package com.example.inheritencedbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.openapitools.api", "com.example.inheritencedbdemo"})
public class InheritanceDbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InheritanceDbDemoApplication.class, args);
	}

}
