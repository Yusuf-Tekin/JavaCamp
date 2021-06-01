package com.api.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@SpringBootApplication
@EnableSwagger2

public class HrmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApiApplication.class, args);
	}
	
	 @Bean
	 public Docket api() { 
		 return new Docket(DocumentationType.SWAGGER_2)  
				 .select()                                  
				 .apis(RequestHandlerSelectors.basePackage("com.api.hrms"))              
				 .build();                                           
	    }

}
