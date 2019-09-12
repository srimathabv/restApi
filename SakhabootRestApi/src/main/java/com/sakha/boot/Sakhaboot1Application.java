package com.sakha.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@EnableAspectJAutoProxy
@SpringBootApplication
public class Sakhaboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sakhaboot1Application.class, args);
	}

}
