package com.javadevsguide.springframework.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//Automatically load classes annotated as - @Controller, @Service, @Repository, @Component
@ComponentScan("com.javadevsguide.springframework.di")
public class AppConfiguration {

//	@Bean
//	private UserService userService = new UserService();
	//1. XML Configuration
	//2. Annotation Config
	//3. Java Beans Config

}
