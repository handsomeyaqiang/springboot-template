package com.jikewang.send;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendApplication.class, args);
	}

}
