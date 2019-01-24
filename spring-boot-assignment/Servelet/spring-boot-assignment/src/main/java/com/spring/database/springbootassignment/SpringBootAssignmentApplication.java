package com.spring.database.springbootassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.spring.database.springbootassignment.repository")
@SpringBootApplication
public class SpringBootAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAssignmentApplication.class, args);
	}

}

