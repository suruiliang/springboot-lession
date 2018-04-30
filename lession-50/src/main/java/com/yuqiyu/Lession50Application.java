package com.yuqiyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Lession50Application {

	public static void main(String[] args) {
		SpringApplication.run(Lession50Application.class, args);
	}
}
