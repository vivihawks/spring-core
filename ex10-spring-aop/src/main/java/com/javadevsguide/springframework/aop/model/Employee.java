package com.javadevsguide.springframework.aop.model;

import com.javadevsguide.springframework.aop.aspect.Loggable;

public class Employee {

	private String name;
	
	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name=nm;
	}
	
	@Loggable
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}
	
}
