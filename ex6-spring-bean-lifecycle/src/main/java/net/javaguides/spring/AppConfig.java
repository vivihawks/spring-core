package net.javaguides.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class AppConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public DatabaseInitiaizer databaseInitiaizer() {
		return new DatabaseInitiaizer();
	}
}
