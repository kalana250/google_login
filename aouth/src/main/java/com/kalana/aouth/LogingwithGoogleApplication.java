package com.kalana.aouth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class LogingwithGoogleApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogingwithGoogleApplication.class, args);
	}

}
