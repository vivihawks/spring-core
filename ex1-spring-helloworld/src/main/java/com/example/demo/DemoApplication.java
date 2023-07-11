package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication

@Configuration
public class DemoApplication {
	
	//@Autowired
	private UserService userServ;
		
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		
		
		new AnnotationConfigApplicationContext(DemoApplication.class)
		.getBean(UserService.class)
			//new DemoApplication().userServ
				.processMsg("Tweet Tweet!!");
		
		
		//new UserService().processMsg("Dummy");
	}

}
