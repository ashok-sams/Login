package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
@EnableJpaRepositories("com.repository") 
@EntityScan("com.model")

public class SpringBootLoginRegisterApplication extends org.springframework.boot.web.support.SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		
		 return application.sources(SpringApplicationBuilder.class);
	}
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootLoginRegisterApplication.class, args);
	}
}
