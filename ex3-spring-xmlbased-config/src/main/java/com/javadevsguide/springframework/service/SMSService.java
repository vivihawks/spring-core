package com.javadevsguide.springframework.service;

public class SMSService implements MessageService{

	public void sendMsg(String message) {
		System.out.println("SMS Service");
		System.out.println(message);
	}

}
