package com.javadevsguide.springframework.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//@Controller
//@Service 
//@Repository @Component
@Primary
public class EmailService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}

}
