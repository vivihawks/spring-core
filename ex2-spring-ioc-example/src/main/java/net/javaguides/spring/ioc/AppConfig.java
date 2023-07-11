package net.javaguides.spring.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public HelloWorld helloWorld() {
		HelloWorld myObj = new HelloWorld();
		myObj.setMessage("Hello World!");
		return myObj;
	}
}
