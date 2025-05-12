package com.example.crudeSecurity;

import com.example.crudeSecurity.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudeSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudeSecurityApplication.class, args);
	}

}
