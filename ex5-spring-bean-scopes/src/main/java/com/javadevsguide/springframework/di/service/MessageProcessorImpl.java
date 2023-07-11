package com.javadevsguide.springframework.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessorImpl implements MessageProcessor {

	private MessageService messageService;
	
	@Value("${settings.retryCount}")
	private int retryCount;
	
	@Value("${settings.connectionUrl}")
	private String dbConnectionString;

	@Autowired(required = true)
	public MessageProcessorImpl(@Qualifier("TwitterService") MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
		System.err.println(this.retryCount);
		System.err.println(this.dbConnectionString);
	}
}
