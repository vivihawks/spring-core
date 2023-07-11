package com.javadevsguide.springframework.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.javadevsguide.springframework.di.service.MessageService;

@Component
public class SetterBasedInjection {
	private MessageService messageService;

	@Autowired
	@Qualifier("TwitterService")
	public void setMessageService(MessageService messageService) {
		/*
		 * if criteria 1 and criteria 2 or criteria 3
		 * 		this.messageService = messageService
		 * 
		 * else 
		 * 	this.messageService = null
		 */
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
