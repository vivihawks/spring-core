package com.javadevsguide.springframework.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TwitterService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}
	
	@PostConstruct
	public void init() {
		System.err.println("Twitter Service Initialized");
	}
	
	@PreDestroy
	public void destroy() {
		System.err.println("Twitter Service about to be Destroyed");
		
	}

}
