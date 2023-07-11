package com.javadevsguide.springframework.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	
	//@Autowired //Dependency Injection / IoC
	private MessageService messageService;
	
	@Autowired
	@Qualifier("SMSService")
	private MessageService messageService2  ;


//	@Autowired
//	@Qualifier("EmailService")
//	public void setMessageService(MessageService messageService) {
//		//Pre-processing logic goes here
//		//...........
//		//...........
//		this.messageService = messageService;
//	}

	public void processMsg(String message) {
		messageService2.sendMsg(message);
	}
}
