package com.javadevsguide.springframework.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.javadevsguide.springframework.di.service.MessageProcessor;
import com.javadevsguide.springframework.di.service.MessageProcessorImpl;
import com.javadevsguide.springframework.di.service.TwitterService;
import com.javadevsguide.springframework.di.service.UserService;

@Configuration
@PropertySource("variables.properties")

//Scopes = Singleton, Prototype, Request, Session, Application, WebSocket
public class AppConfiguration {

	@Bean
	@Scope("prototype")
	public UserService userService(){
		return new UserService();
	}

	@Bean
	public MessageProcessor msgProcessor(){
		return new MessageProcessorImpl(new TwitterService());
	}

}
