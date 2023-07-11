package com.example.demo;

import org.springframework.stereotype.Service;

@Service //@Controller @Component @Repository
public class UserService {

	public void processMsg(String message) {
		System.err.println("****** Hello World!!! ******");
		System.out.println("Received the below message vvvvvvv" );
		System.out.println(message );
		
	}

}



