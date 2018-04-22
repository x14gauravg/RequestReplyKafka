package com.gauravg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "com.gauravg.config",
        "com.gauravg.consumer",
        "com.gauravg.controller",
        "com.gauravg.model"
    })
@SpringBootApplication
public class RequestReplyKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestReplyKafkaApplication.class, args);
	}
}
