package com.projectx.application.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.projectx.application"})
@EntityScan({"com.projectx.application.model"})
@EnableJpaRepositories({"com.projectx.application.repository"})
@SpringBootApplication
public class AppMainMethod {

	public static void main(String[] args) {
		SpringApplication.run(AppMainMethod.class, args);
	}

}
