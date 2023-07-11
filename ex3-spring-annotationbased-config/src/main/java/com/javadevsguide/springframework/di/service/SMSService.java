package com.javadevsguide.springframework.di.service;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("SMS: " + message);
	}

}

/*
Bean : 	UserService, MessageService
		Definition	-	@Controller, @Service, @Repository, @Component
			@Controller - @RequestMapping
			@Component @Service - No Obligation
			@Repository	- DO NOT Interchange
		Definition	-	@Bean in the Config file
		Consumption	-	Autowired

*/