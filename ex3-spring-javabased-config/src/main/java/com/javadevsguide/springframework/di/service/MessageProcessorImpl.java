package com.javadevsguide.springframework.di.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageProcessorImpl implements MessageProcessor , ApplicationContextAware{
	
	
	@Autowired
	@Qualifier("TwitterService") 
	private MessageService messageService;

	@Autowired
	public MessageProcessorImpl(@Qualifier("TwitterService") MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
	}

}
