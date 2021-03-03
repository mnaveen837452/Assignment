package com.qlik.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class QlikAssignmentApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(QlikAssignmentApplication.class, args);
	}

}
