package com.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.simple","com.simple.jssc"})
@SpringBootApplication
@EnableAutoConfiguration
public class JsscTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsscTestApplication.class, args);
	
	
	}
}
