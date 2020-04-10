package com.test.shortURL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	
	public static String HOST_NAME = "http://localhost:8080/";

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
