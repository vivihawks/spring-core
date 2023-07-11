package com.javadevsguide.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.javadevsguide.springframework.di.service.EmailService;
import com.javadevsguide.springframework.di.service.MessageService;
import com.javadevsguide.springframework.di.service.SMSService;

@Configuration
@ComponentScan("com.javadevsguide.springframework.di")
@Import(AppConfiguration2.class)
public class AppConfiguration {

	@Bean(name="emailService")
	@Scope("prototype")
	public MessageService emailService(){
		//if criteria 1 true 
		return new EmailService();
		//if criteria 2 true
		//reture new SMSService();
	}
	
	@Bean(name="smsService")
	public MessageService smsService(){
		return new SMSService();
	}
	/*
	 * @Autowired, 
	 * @Qualifier
	 */
	
	/*
	 * @Bean
	 * @Component
	 * @Service
	 * @Repository
	 */
}
